package com.yp.bigdata;

/**
 * Created by yuan on 2018/3/23.
 */
//寻找字符串 是否存在 和 频率  和  前缀频率
    //另一种方法是hash  与之相比  trie 通过前缀匹配可以避免许多无意义的计算
    //trie 和 hashmap 类似 也是key-value结构  但是其 【插入、查询】时间复杂度为 O(k) 与key长度有关而和个数(n)无关
    //Hash虽然号称O(1)实际也是O(k)，而且有hash碰撞的问题
    //但是trie消耗空间巨大  优点是查询效率比hash表高 通过前缀比对
    //trie可以看做hash的变种
public class TrierDemo {

    Node root=new Node();

    public void insert(String s){
        s=s.toLowerCase();
        Node cur=root;

        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';

            //之前没有这个字符
            if(cur.childs[index]==null){
                cur.childs[index]=new Node();
                cur.childs[index].count++;
            }else{//之前有过这个
                cur.childs[index].count++;
            }

            if(i==s.length()-1){
                cur.isEnd=true;
                cur.endcount++;
            }

            cur=cur.childs[index];

        }

    }

    private boolean search(String word){
        char[] chs=word.toLowerCase().toCharArray();
        for(int i=0,length=chs.length; i<length;i++){
            int index=chs[i]-'a';
            if(root.childs[index]==null){
                ///如果不存在，则查找失败
                return false;
            }
            root=root.childs[index];
        }

        return true;
    }

    private int count(String word){
        char[] chs=word.toLowerCase().toCharArray();
        for(int i=0,length=chs.length; i<length;i++){
            int index=chs[i]-'a';
            if(root.childs[index]==null){
                ///如果不存在，则查找失败
                return -1;
            }
            if(i==length-1) return  root.endcount;

            root=root.childs[index];

            //System.out.println(root.count+"    i:"+i);

        }

        return root.endcount;
    }

    class Node{
        int count;
        int endcount;
        Node[] childs;
        boolean isEnd;

        public Node(){
            this.count=0;
            this.isEnd=false;
            this.childs=new Node[26];
        }

    }

    public static void main(String[] args) {
        TrierDemo trie=new TrierDemo();

        trie.insert("I");
        trie.insert("Love");
        trie.insert("China");
        trie.insert("China");
        trie.insert("China");
        trie.insert("China");
        trie.insert("China");
        trie.insert("xiaoliang");
        trie.insert("xiaoliang");
        trie.insert("man");
        trie.insert("handsome");
        trie.insert("love");
        trie.insert("chinaha");
        trie.insert("her");
        trie.insert("know");

        //System.out.println(trie.search("manman"));
        System.out.println(trie.count("love"));
    }
}
