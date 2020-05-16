package com.JavaPractice.Collection_Map;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Dequeue_Impl {

    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<Integer>();

        dq.add(10);
        dq.addFirst(23);
        dq.addLast(54);
        dq.offer(55);
        dq.offerFirst(1);
        dq.offerLast(33);
        dq.add(0);

        System.out.println("Deque is :" + dq);

        dq.pollFirst();
        dq.pollLast();

        Iterator iterator = dq.iterator();

        System.out.println("Forward order iterator :");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nReverse order iterator :");

        Iterator iterator1 = dq.descendingIterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

        // System.out.println("Deque after operation is :"+dq);

        System.out.println("\nExamine first element :" + dq.peekFirst() + " Examine last element :" + dq.peekLast());

        System.out.println("Deque contains :" + dq.contains(35));


        //ConcurrentLinkedDeque

        ConcurrentLinkedDeque<Integer> cdq = new ConcurrentLinkedDeque<Integer>();

        cdq.addFirst(23);
        cdq.addFirst(54);
        cdq.addLast(19);
        // cdq.addLast(null); It throws null pointer exception

        System.out.println("ConcurrentLinkedQueue is :" + cdq);

        //ArrayDeque

        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();

        adq.addFirst(4);
        adq.addFirst(5);
        adq.offerLast(8);
        //adq.add(null);  It throws null pointer exception

        System.out.println("ArrayDeque is: " + adq + " size is :" + adq.size());

    }
}
