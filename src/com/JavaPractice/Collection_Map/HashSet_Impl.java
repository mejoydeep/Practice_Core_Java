package com.JavaPractice.Collection_Map;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSet_Impl {

    public static void main(String[] args) {
        HashSet<Integer> hSet1 = new HashSet<>();

        hSet1.add(10);
        hSet1.add(81);
        hSet1.add(65);
        hSet1.add(10);

        Iterator iterator = hSet1.iterator();

        System.out.println("hashSet Elements : ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        //Iterator over HashSet
        hSet1.forEach(e -> System.out.print(e + " "));

        System.out.println("\nSynchronized HashSet ");
        Set s = Collections.synchronizedSet(hSet1);

        s.forEach(e -> System.out.print(e + " "));
    }
}
