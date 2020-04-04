package com.DataStructure.LinkedList;

/**
 * Created by JC52036 on 03-02-2020.
 */
public class LinkidList_06 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
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

    public void removeDuplicate(){
        Node curr=head;
        while (curr!=null){
            Node temp=curr;
            while (temp !=null && temp.data==curr.data){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
    }

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkidList_06 l=new LinkidList_06();
        l.push(12);
        l.push(12);
        l.push(13);
        l.push(14);
        l.push(14);
        l.push(16);

        System.out.println("Before removing the duplicate: ");
        l.printList();

        l.removeDuplicate();
        System.out.println("After removing the duplicate: ");
        l.printList();
    }
}
