package com.JavaPractice.Collection_Map;

import java.util.*;
import java.util.stream.Collectors;

public class MapPractice {

    static <K,V> Map<K,V> addDefaultValue(Map<K,V> map, V defValue){
        map = map.entrySet().stream().map(entry -> {
            if (entry.getValue() == null){
                entry.setValue(defValue);
            }
            return entry;
        }).collect(Collectors.toMap(Map.Entry :: getKey , Map.Entry :: getValue));

        return map;
    }

    static <T>List<T> convertToList(Collection<List<T>> listVal){

        List<T> lists = new ArrayList<>();

        // Either way we can convert the values into a list
        
       // listVal.stream().forEach(e -> lists.addAll(e));
        for (List<T> list : listVal){
            list.stream().forEach(lists :: add);
        }

        return lists;
    }
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,null);
        map.put(4,"Four");
        map.put(5,null);

        String defVal = "nullVal";
        System.out.println(" Map before adding default value : "+map);
        map = addDefaultValue(map,defVal);
        System.out.println(" Map after adding default value : "+map);

        //Map to send a list of values
        Map<Integer, List<Character>> listMap = new HashMap<>();
        listMap.put(1, Arrays.asList('a','b','c'));
        listMap.put(2, Arrays.asList('d','e','f'));

        Collection<List<Character>> val = listMap.values();

        System.out.println(" List converts the values : "+listMap);
        System.out.println(" List of values :"+convertToList(val));


    }
}
