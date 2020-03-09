package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by JC52036 on 06-03-2020.
 */
public class DistintElement {
    public static void main(String[] args) {
        List<Integer> str = Arrays.asList(10, 20, 30, 20, 10, 40, 30, 50, 50);

        Set<Integer> set = str.stream().collect(Collectors.toSet());
        System.out.println("Printing the set" + set);

        List<Integer> withoutDuplicate = str.stream().distinct().collect(Collectors.toList());

        System.out.println(withoutDuplicate);
    }
}
