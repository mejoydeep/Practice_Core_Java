package com.DataStructure;

import java.util.HashSet;

/**
 * Created by JC52036 on 22-01-2020.
 */

//Check if the loop has any circular reference or not
public class LinkedList_04 {
    static Node head; // head of list

    /* Linked list Node*/
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    static public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    static public boolean detectLoop(Node node) {
        HashSet<Node> h=new HashSet<Node>();
        while(node !=null) {
            if(h.contains(node)) {
                return true;
            }
            h.add(node);
            node=node.next;
        }
        return false;
    }



    public static void main(String[] args)
    {
        LinkedList_04 llist = new LinkedList_04();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
}

