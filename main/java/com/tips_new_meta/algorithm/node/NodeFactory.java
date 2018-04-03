package com.tips_new_meta.algorithm.node;

/**
 * Created by yuan on 2017/12/26.
 */
public class NodeFactory {

    public static Node nodeList(){
        Node head=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(5);

        head.next=two;
        two.next=three;
        three.next=four;
        four.next=five;

        return head;
    }
}
