package com.tips_new_meta.algorithm.node;

/**
 * Created by yuan on 2017/12/26.
 */
public class Node {
    int value;
    Node next;

    public Node(int value){
        this.value=value;
    }

    public void printNode(){
        System.out.println(value);
        if(next!=null) next.printNode();
    }
}
