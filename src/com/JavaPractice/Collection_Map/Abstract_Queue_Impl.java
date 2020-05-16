package com.JavaPractice.Collection_Map;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.*;

public class Abstract_Queue_Impl {

    public static void main(String[] args) throws InterruptedException {

        AbstractQueue<Integer> aq = new LinkedBlockingQueue<Integer>();

        aq.add(10);
        aq.add(21);
        aq.add(65);
        aq.add(40);

        System.out.println("Abstract queue :" + aq);

        System.out.println("Abstract Queue head element :" + aq.element());

        aq.remove();
        System.out.println("After removal abstract queue :" + aq);

        aq.clear();
        System.out.println("After clearing abstract queue :" + aq);

        ArrayBlockingQueue<String> aq2 = new ArrayBlockingQueue<String>(5);

        aq2.add("DF");
        aq2.add("tr");
        aq2.add("re");
        aq2.add("ju");
        aq2.add("td");
        aq2.offer("SAl");
        System.out.println("ArrayBlockingQueue :" + aq2);

        aq2.remove();
        aq2.put("gt");

        System.out.println("ArrayBlockingQueue after remove and put:" + aq2);

        ArrayList<String> al = new ArrayList<>();

        aq2.drainTo(al, 3);

        System.out.println("After draining arraylist :" + al + " queue " + aq2);


        //ConcurrentLinked Queue

        ConcurrentLinkedQueue<Integer> cq = new ConcurrentLinkedQueue<>();
        cq.offer(4);
        cq.offer(12);

        System.out.println();
        cq.forEach(e -> System.out.println(e));
        System.out.println("\nConcurrent Linked Queue :" + cq);

        LinkedTransferQueue<Integer> lt = new LinkedTransferQueue<>();
        lt.addAll(cq);

        System.out.println("\nLinkedTranferqueue :" + lt);


        //PriorityBlockingQueue

        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>(5, Comparator.reverseOrder());
        pq.add(34);
        pq.add(12);
        pq.add(2);
        pq.add(1);
        pq.add(100);


        System.out.println("\nPriorityBlockingQueue :" + pq + " element " + pq.element() + " peek " + pq.peek());


    }
}
