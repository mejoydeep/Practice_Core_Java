package com.JavaPractice.Collection_Map;

import java.util.*;

/**
 * Created by JC52036 on 04-03-2020.
 */
public class AbstractCollection {
    public static void main(String[] args) {
        java.util.AbstractCollection<Object> obj1=new ArrayList<>();
        obj1.add("Rahul");
        obj1.add("4");
        obj1.add("Sai");
        obj1.add("Alam");
        obj1.add("Abhishek");

        java.util.AbstractCollection<Object> obj2= new TreeSet<>();
        obj2.addAll(obj1);

        java.util.AbstractCollection<Object> obj3=new PriorityQueue<>();
        obj3.addAll(obj1);

        java.util.AbstractCollection<Object> obj4=new HashSet<>();
        obj4.add(obj1);

        java.util.AbstractCollection<Object> obj5=new Stack<>() ;
        obj5.add(obj1);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);

        obj1.remove("4");
        System.out.println(obj1);


    }
}
