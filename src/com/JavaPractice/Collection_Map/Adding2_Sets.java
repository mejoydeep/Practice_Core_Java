package com.JavaPractice.Collection_Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Adding2_Sets {


    public static <T> Set<T> setAdd(Set<T> a, Set<T> b) {

        /*return new HashSet<T>(){
            {
                addAll(a);
                addAll(b);
            }
        };*/

        return Stream.concat(a.stream(), b.stream()).collect(Collectors.toSet());
    }

    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[]{0, 2, 4, 6}));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(new Integer[]{1, 3, 4, 5}));


        System.out.println("Adding 2 sets :" + setAdd(a, b));
    }
}
