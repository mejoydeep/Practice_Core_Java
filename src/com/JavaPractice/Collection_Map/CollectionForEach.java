package com.JavaPractice.Collection_Map;

import java.util.HashSet;

public class CollectionForEach {

    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(7);

        set.forEach(integer -> System.out.println(integer));
    }
}
