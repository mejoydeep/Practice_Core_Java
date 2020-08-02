package com.JavaPractice.Collection_Map;

import java.util.HashMap;
import java.util.Map;

public class FindMaxkeyinMap {

    static <K extends Comparable<K>,V>Map.Entry<K,V> getmaxKey(Map<K,V> map){

        Map.Entry<K,V> maxKey = null;

        for (Map.Entry<K,V> eset : map.entrySet()){
          if (maxKey == null || eset.getKey().compareTo(maxKey.getKey()) > 0){
              maxKey =eset;
          }
        }
       return maxKey;
    }
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"Two");
        map.put(1,"One");
        map.put(6,"Six");
        map.put(4,"Four");
        System.out.println("Maximum key : "+getmaxKey(map));
    }
}
