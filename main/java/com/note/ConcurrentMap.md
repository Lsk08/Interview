### 内部类
* Node<k,V> 
    * ConcurrentMap 的数组k-V基本结构 transient volatile Node<K,V>[] table;
    * 每个node又是这个数组链表的header 包含一个指向下一个node的指针
        *            final int hash;//key的hash
                     final K key;//key
                     volatile V val;//value
                     volatile Node<K,V> next;//链表的指针
    * Node 不支持set,所有的set只能通过替换整个Node完成，也就是node只读，保证node级别的线程安全。也就是通过【实现一个不支持写的内部类从而保证线程安全性，也是一种方法】。
        *           public final V setValue(V value) {
                        throw new UnsupportedOperationException();
                    }
    * Node本身不支持写，但是可以创建新的Node以替换旧的Node,达到修改的目的，并且通过CAS保证线程安全
        *           //利用volatile方法设置节点位置的值
                static final <K,V> void setTabAt(Node<K,V>[] tab, int i, Node<K,V> v) {
                    U.putObjectVolatile(tab, ((long)i << ASHIFT) + ABASE, v);
                }
        * 关于CAS 
            * CAS本质上是判断当前是否存在线程竞争，如果不存在就以硬件级别的原子性操作执行set，否则返回false表示存在多线程竞争，
        需要对这个操作进行补偿，一般是加入循环直到执行完成。 
            * 也就是CAS本质是非阻塞锁，假定当前没有线程竞争而操作。
            * 使用的时候，用if(cas)判断操作是否完成，配合while做补偿，也就是【不断的寻找没有线程竞争的间隙执行对应操作】，也就是【局部的单线程】，从而保证该操作的线程安全。
    * CAS使用 实例
        *       private final Node<K,V>[] initTable() {
                    Node<K,V>[] tab; int sc;
                    //这个while和if相当于double-check 对应于初始化的最后3句
                    while ((tab = table) == null || tab.length == 0) {
                            //sizeCtl表示有其他线程正在进行初始化操作，把线程挂起。对于table的初始化工作，只能有一个线程在进行。
                        if ((sc = sizeCtl) < 0)
                            Thread.yield(); // lost initialization race; just spin
                        else if (U.compareAndSwapInt(this, SIZECTL, sc, -1)) {
                        //利用CAS方法把sizectl的值置为-1 表示本线程正在进行初始化
                        //如果失败，又会进入while循环补偿，如果初始化没有完成，则会进入while和sc=sizeCtl<0，一直while等待
                        //等到初始化完成table=tab=nt!=null 或者 sizeCtl=sc=n-(n>>>2)>0 也就是不再进入while，初始化结束
                        // 一般人写不了，直接用sync得了 。。
                            try {
                                if ((tab = table) == null || tab.length == 0) {
                                    int n = (sc > 0) ? sc : DEFAULT_CAPACITY;
                                    @SuppressWarnings("unchecked")
                                    Node<K,V>[] nt = (Node<K,V>[])new Node<?,?>[n];
                                    table = tab = nt;
                                    sc = n - (n >>> 2);//相当于0.75*n 设置一个扩容的阈值
                                }
                            } finally {
                                sizeCtl = sc;
                            }
                            break;
                        }
                    }
                    return tab;
                }