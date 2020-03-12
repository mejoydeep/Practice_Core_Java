package com.JavaPractice.Collection_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

/**
 * Created by JC52036 on 09-03-2020.
 */
public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(35);
        arr.add(54);
        arr.add(1);
        arr.add(86);
        arr.add(31);

        arr.forEach((n)-> System.out.print(n+" "));

        //removeIf method as a predicate
        System.out.println();
        arr.removeIf((n)->(n%3==0));
        System.out.println(arr);

        //subList() in arraayList
        List<Integer> arr2=arr.subList(1,3);
        System.out.println(arr2);

        //splitarator method in java
        Spliterator<Integer> st= arr.spliterator();
        System.out.println("List of integers");
        st.forEachRemaining((n)->System.out.print(n+" "));


    }
}
