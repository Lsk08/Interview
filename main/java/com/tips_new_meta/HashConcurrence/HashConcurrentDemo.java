package com.tips_new_meta.HashConcurrence;

/**
 * Created by yuan on 2018/3/14.
 */
//哈希一致性算法  1 构建一个hash环 2^32  2 创建节点 3 把数据按照hash映射到环上  4 把数据存入顺时针第一个节点node
    //一般用在缓存redis的定位  可以使增加或者删除节点时 数据迁移量最小
    //改进 虚拟节点 virtual node 均匀分布在 hash ring 也就是数据先映射到hash环 再对应到真实节点  作用 每个节点的数据均匀分布
public class HashConcurrentDemo {

    public static void main(String[] args) {
        int range=2<<4;//暂时取16为hash ring

        //node
        //int[] nodes={1,4,8,12};
        int[] nodes={3,6};

        //data
        int[] datas={3,5,7,8,12,44};

        for(int data:datas){
            int pos=data%range;
            if(pos>nodes[nodes.length-1]){
                System.out.println("data "+data+" belongs to node "+nodes[nodes.length-1]);
            }else{

                for(int i=0;i<nodes.length-1;i++){
                    if(nodes[i]==pos) {
                        System.out.println("data "+data+" belongs to node "+nodes[i]);
                    }
                    if(nodes[i]<pos&&pos<=nodes[i+1]){
                        System.out.println("data "+data+" belongs to node "+nodes[i+1]);
                    }
                }
            }

        }


    }
}
