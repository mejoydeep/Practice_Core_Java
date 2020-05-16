package com.JavaPractice.Collection_Map;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Impl {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Ram");
        ts.add("Rahim");
        ts.add("Joy");
        ts.add("Shubham");
        ts.add("Aishee");

        System.out.println("Printing TreeSet");
        ts.forEach(e -> System.out.print(e + " "));

        System.out.println("\nAfter converting it into a synchronized sorted set");
        Set s = Collections.synchronizedSortedSet(ts);
        s.forEach(e -> System.out.print(e + " "));

    }
}
