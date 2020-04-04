package com.DataStructure.LinkedList;

/**
 * Created by JC52036 on 27-01-2020.
 */
public class LinkedList06_ReverseofALinkidList {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    public void print_the_linkedList(Node temp){
        if(head==null){
            System.out.println("Link list empty");
        }
        else{
            Node node=temp;
            while(node!=null){
                System.out.print(node.data+", ");
                node=node.next;
            }
            System.out.println();

        }
    }

    public void reverse(){
        Node current=head;
        Node next=null;
        Node prev=null;
        while(current !=null){
           next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        print_the_linkedList(prev);
    }

    public static void main(String[] args) {
        LinkedList06_ReverseofALinkidList l1=new LinkedList06_ReverseofALinkidList();
        l1.push(10);
        l1.push(32);
        l1.push(43);
        l1.push(87);
        l1.push(12);
        l1.reverse();
    }
}
