package com.JavaPractice.Collection_Map;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class NavigableSet_Impl {

    public static void main(String[] args) {

        NavigableSet<Integer> nav = new TreeSet<>();
        nav.add(10);
        nav.add(32);
        nav.add(4);
        nav.add(6);

        NavigableSet<Integer> nav1 = nav.descendingSet();

        System.out.println("nav set");
        nav.forEach(e -> System.out.print(e + " "));

        System.out.println("\nnav set reverse order");
        nav1.forEach(e -> System.out.print(e + " "));
        System.out.println("\nlower :" + nav.ceiling(1));

        //ConcurrentSkipListSet

        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        concurrentSkipListSet.add(4);
        concurrentSkipListSet.add(6);
        concurrentSkipListSet.add(87);
        concurrentSkipListSet.add(32);

        System.out.println("Concurrent SkipListSet :" + concurrentSkipListSet);
        System.out.println(" Last :" + concurrentSkipListSet.last());
    }
}
