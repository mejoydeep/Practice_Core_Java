package com.JavaPractice.Collection_Map;

import java.util.*;

public class HashmapImpl {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("K1",12);
        map.put("K2",14);
        map.put("K3",15);

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key :"+entry.getKey() +" value :"+entry.getValue());
        }

        // SortedMap
        SortedMap<Integer,String> sMap= new TreeMap<>();
        sMap.put(18,"dsf");
        sMap.put(16,"def");
        sMap.put(76,"efr");
        Set set = sMap.entrySet();

        Iterator i = set.iterator();
        while (i.hasNext()){
            Map.Entry e =(Map.Entry)i.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
