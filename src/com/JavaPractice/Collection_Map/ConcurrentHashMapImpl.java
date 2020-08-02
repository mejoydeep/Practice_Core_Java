package com.JavaPractice.Collection_Map;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapImpl {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<>();
        chm.put(1,"Joy");
        chm.put(2,"Bastab");
        chm.put(3,"Asish");

        System.out.println(chm);

        chm.compute(1,(integer, s) -> s.concat("deep"));
        chm.computeIfPresent(2, (key,val)->val.replace("Bastab","Utpal"));
        System.out.println(chm);

    }
}
