package com.DataStructure;

/**
 * Created by JC52036 on 18-01-2020.
 */
public class LinkedList02 {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }

    }

   //adding a node at the last of the linkedlist
    public void addNode(int value){
        Node node=new Node(value);
        if(head==null){
         head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    //Deleting a node
    public void delete_Node_of_given_value(int value){
        if(head.data==value){
            head=head.next;
        }
        else{
            Node node=head;
            Node temp;
            while(node.next.data!=value){
             node=node.next;
            }
            temp=node.next;
            node.next=temp.next;
            temp=null;
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

    public static void main(String[] args) {
        LinkedList02 l=new LinkedList02();
        l.addNode(2);
        l.addNode(4);
        l.addNode(6);
        l.printLinkList();
        l.delete_Node_of_given_value(6);
        l.printLinkList();
    }
}
