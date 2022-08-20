package com.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestFunctional {

    public static void main(String[] args) {
        //List of strings
        List<String> stringList = Arrays.asList("ina", "bina", "naga", "maga");

        Predicate<String> p = s -> s.startsWith("i") || s.startsWith("n");

        for (String str : stringList){
            if (p.test(str)){
                System.out.println(str);
            }
        }
    }
}
