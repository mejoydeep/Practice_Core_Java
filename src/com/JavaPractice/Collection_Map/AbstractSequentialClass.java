package com.JavaPractice.Collection_Map;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by JC52036 on 09-03-2020.
 */
public class AbstractSequentialClass {
    public static void main(String[] args) {
        AbstractSequentialList<String> abstractSequentialList=new LinkedList<>();
        abstractSequentialList.add("Geeks");
        abstractSequentialList.add("For");
        abstractSequentialList.add("Geeks");
        abstractSequentialList.add("10");

        System.out.println("AbstractSequentialList :"+abstractSequentialList);

        abstractSequentialList.set(3,"Surya");

        System.out.println("AbstractSequentialList after setting value: "+abstractSequentialList);

    }
}
