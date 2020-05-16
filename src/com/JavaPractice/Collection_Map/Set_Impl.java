package com.JavaPractice.Collection_Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Impl {

    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<Integer>();
        s1.addAll(Arrays.asList(1, 5, 2, 3));

        Set<Integer> s2 = new HashSet<Integer>();
        s2.addAll(Arrays.asList(0, 4, 6, 1, 2));

        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println("Union of 2 sets :" + union);

        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println("Intersection of 2 sets :" + intersection);

        Set<Integer> diff = new HashSet<>(s2);
        diff.removeAll(s1);
        System.out.println("Difference of 2 sets :" + diff);
    }
}
