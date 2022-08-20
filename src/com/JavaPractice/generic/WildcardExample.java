package com.JavaPractice.generic;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    public static <T> void checkObj(List<?> list, T obj){
        if (list.contains(obj)){
            System.out.println("The list "+list+" contains "+obj);
        }else {
            System.out.println("The list "+list+" does not contains "+obj);
        }
    }

    public static <T> void checkNum(List<? extends Number> list, T obj){
        if (list.contains(obj)){
            System.out.println("The list "+list+" contains "+obj);
        }else {
            System.out.println("The list "+list+" does not contains "+obj);
        }
    }

    /**
     * The method will print a list of unknown list
     * @param list
     * @param <T>
     */
    public static <T> void printList(List<T> list){
        for (Object obj : list){
            System.out.println(obj);
        }
        System.out.println("******");
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        List<Object> list3 = new ArrayList<>();
        list3.add("four");
        list3.add("five");
        list3.add("six");
        list3.add(list1);

        WildcardExample.printList(list1);
        WildcardExample.printList(list2);
        WildcardExample.printList(list3);

        WildcardExample.checkObj(list1, "one");
        WildcardExample.checkNum(list2, 5);
        WildcardExample.checkObj(list3, list1);
    }
}
