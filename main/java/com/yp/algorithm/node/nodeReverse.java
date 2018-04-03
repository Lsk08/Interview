package com.yp.algorithm.node;

/**
 * Created by yuan on 2017/12/26.
 */
public class nodeReverse {

    public static  Node reverseNode(Node head){
        if(head==null||head.next==null) return head;

        Node oldhead=head;
        Node newHead=head;
        while(oldhead.next!=null){
            //缓存下一个节点
            Node tmp=oldhead.next;
            //1->3
            oldhead.next=tmp.next;
            //2->1
            tmp.next=newHead;
            //更新newHead
            newHead=tmp;
        }

        return newHead;
    }

    public static void main(String[] args) {
        Node head=NodeFactory.nodeList();
        Node n=reverseNode(head);
        n.printNode();

    }
}
