package com.JavaPractice.Collection_Map;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Example {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<String>();

        ts.add("Geeks");
        ts.add("for");
        ts.add("Geeks");
        ts.add("GeeksForGeeks");

        System.out.println(ts+"\n");

        Set<String> s=new HashSet<String>(){
            {
                add("Joy");
                add("Bastab");
                add("Som");
            }
        };

        System.out.println(s);
    }

}
