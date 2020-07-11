package com.JavaPractice.Collection_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImpl {
    public static void main(String[] args) {
        LinkedHashMap<String,String> lhM = new LinkedHashMap<String,String>();
        lhM.put("one","Life is worth making evergreen");
        lhM.put("two","change is inevitable");
        lhM.put("three","make it easier");

        System.out.println(lhM);
        for (Map.Entry mapIterator : lhM.entrySet()){
            String key = (String) mapIterator.getKey();
            String val = (String) mapIterator.getValue();
            System.out.println("Key :"+key+" :: value :"+val);
        }
    }
}
