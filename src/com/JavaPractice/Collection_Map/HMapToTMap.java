package com.JavaPractice.Collection_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HMapToTMap {

    static Map<Integer,String> covTM(Map<Integer,String> map){
        SortedMap<Integer,String> tMap = new TreeMap<>();

        tMap = map.entrySet().stream().collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue, (oldVal, newVal) -> newVal,
                TreeMap::new));

        return tMap;
    }

    public static void main(String[] args) {
        HashMap<Integer,String> s = new HashMap<>();
        s.put(1,"fghj");
        s.put(6,"mju");
        s.put(3,"dx");
        s.put(2,"vfgb");

        System.out.println("HashMap :"+s);
        System.out.println(" TreeMap :" +covTM(s));

    }


}
