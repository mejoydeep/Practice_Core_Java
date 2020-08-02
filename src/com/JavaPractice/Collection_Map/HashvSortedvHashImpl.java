package com.JavaPractice.Collection_Map;

import java.util.*;

public class HashvSortedvHashImpl {

    public static  void insertOrder(AbstractMap<Integer,String> map){
        int array[] = {1,-1,0,-2,4};
        for (int x : array){
            map.put(x,Integer.toString(x));
        }
        for (int k : map.keySet()){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<>();
        insertOrder(hm);
        System.out.println();

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        insertOrder(lhm);
        System.out.println();

        TreeMap<Integer,String> stm =new TreeMap<>();
        insertOrder(stm);
    }
}
