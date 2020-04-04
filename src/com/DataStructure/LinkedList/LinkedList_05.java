package com.DataStructure.LinkedList;


import java.util.Stack;

/**
 * Created by JC52036 on 22-01-2020.
 */
public class LinkedList_05 {
    Node head;

    static class Node {
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

    public boolean detectLoop() {
        Node fast_node = head;
        Node slow_node = head;
        while (fast_node != null && slow_node != null && fast_node.next != null) {
            slow_node = slow_node.next;
            fast_node = fast_node.next.next;
            if (fast_node == slow_node) {
                /*Count of the loop*/
                System.out.println("Count of the loop: " + countloop(slow_node));
                return true;
            }
        }
        return false;
    }

    //Count of the loop
    int countloop(Node node) {
        int count = 1;
        Node temp = node;
        while (temp.next != node) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /*Check if the linked list is PALLINDROME */
    boolean isPallindrome() {
        Node temp = head;
        Node node = head;
        boolean isPalindrome = true;
        Stack<Integer> st = new Stack<Integer>();
        while (temp != null) {
            st.add(temp.data);
            temp = temp.next;
        }
        while (node != null) {
            int i = st.pop();
            if (node.data == i) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            node = node.next;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        LinkedList_05 llist = new LinkedList_05();

        llist.push(10);
        llist.push(12);
        llist.push(13);
        llist.push(12);
        llist.push(10);

        /*Create loop for testing */
        // llist.head.next.next.next.next = llist.head;

        if (llist.detectLoop())
            System.out.println("Loop found");
        else
            System.out.println("No Loop");


        //Printing the pallindrome number
        System.out.println("IsPallindrome no:" + llist.isPallindrome());
    }
}
