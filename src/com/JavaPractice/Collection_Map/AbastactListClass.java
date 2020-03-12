package com.JavaPractice.Collection_Map;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by JC52036 on 09-03-2020.
 */
public class AbastactListClass {
    public static void main(String[] args) {
        AbstractList<String>  absList=new ArrayList<>();
        absList.add("Tree");
        absList.add("Set");
        absList.add("Map");

        System.out.println(absList);

        AbstractList<String> abstractList2=new LinkedList<>(absList);

        abstractList2.remove(2);
        System.out.println(abstractList2);

    }
}
