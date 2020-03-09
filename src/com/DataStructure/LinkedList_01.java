package com.DataStructure;

/**
 * Created by JC52036 on 18-01-2020.
 */
public class LinkedList_01 {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }

    }


    //print the Link list
    public void printLinkList(){
        Node n=head;
        while(n!=null){
            if(n==head){
                System.out.print(n.data);
            }
            else{
                System.out.print(", "+ n.data);
            }
            n=n.next;
        }
        System.out.println();

    }

    //Adding a node in the  linkedlist
    public void addNode(int data,int position,int givenNode){
        Node newNode=new Node(data);
        //Adding a node at the begining of the linked list
        if(position==0){
            newNode.next=head;
            head=newNode;
        }
        //Adding a node after a given node
        if(position==1){
            Node temp=head;
            while(temp.data!=givenNode){
                temp=temp.next;
            }
           newNode.next=temp.next;
            temp.next=newNode;
        }
        //Adding a node at the end
        if(position==2){
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public static void main(String[] args) {
        LinkedList_01 list=new LinkedList_01();
        list.head=new Node(1);
        Node seconed=new Node(2);
        Node third=new Node(3);

        list.head.next=seconed;
        seconed.next=third;

        list.printLinkList();

        //Adding a node in the LinkedList
        //Adding a node at the begining
       list.addNode(10,0,0);
        list.printLinkList();
        list.addNode(11,1,2);
        list.printLinkList();
        list.addNode(12,2,0);
        list.printLinkList();

    }
}
