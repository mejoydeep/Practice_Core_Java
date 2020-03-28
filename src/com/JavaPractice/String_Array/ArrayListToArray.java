package com.JavaPractice.String_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Object[] objects=al.toArray();

        for (Object obj: objects){
            System.out.println(obj);
        }

        Integer[] intObj=new Integer[al.size()];
        intObj=al.toArray(intObj);

        for (Integer i:
             intObj) {
            System.out.print(i+" ");
        }


    }
}
