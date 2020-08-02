package com.JavaPractice.Collection_Map;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListVSHashMap {

    public static void main(String[] args) {

        //Can store multiple null values
        ArrayList<String> al = new ArrayList<>();
        al.add("Joy");
        al.add(null);
        al.add("Chak");
        al.add(null);

        //Can store 1 null key but multiple null values
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Joy");
        hashMap.put(null,"Chak");
        hashMap.put(null,null);
        hashMap.put(2,null);
        hashMap.put(3,null);

        System.out.println("Print Arraylist :"+al);
        System.out.println("Print Hashmap :"+hashMap);

        System.out.println("******************");

        /* Cloning a Hashmap in to others */
        HashMap<Integer,String> hmp = new HashMap<>();
        hmp.put(1,"One");
        hmp.put(2,"two");
        hmp.put(3,"Three");
        hmp.put(4,"Four");
        System.out.println(hmp);
        // Way : 1
        HashMap<Integer,String> hmp2 = new HashMap<>(hmp);
        System.out.println("1st copy :"+hmp2);

        //Way : 2
        HashMap<Integer,String> hmp3 = new HashMap<>();
        hmp3.putAll(hmp2);
        System.out.println("2nd copy :"+hmp3);

        //Way : 3
        HashMap<Integer,String> hmp4 = new HashMap<>();
        for (Map.Entry emp : hmp.entrySet()){
            hmp4.put((Integer) emp.getKey(),(String) emp.getValue());
        }
        System.out.println("3rd way :"+hmp4);

        //Way : 4
        Map<Integer,String> hmp5 = new HashMap<>();
        hmp5 = hmp.entrySet().stream().collect(Collectors.toMap(Map.Entry :: getKey ,Map.Entry :: getValue));
        System.out.println( "4th way :"+hmp5);

        System.out.println("******************");

        /* TreeMap
        *  in reverse order
        * */

        TreeMap<Integer,String> tmap = new TreeMap<>(Collections.reverseOrder());
        tmap.putAll(hmp);
        System.out.println("Treemap in reverse order :"+tmap);

        /*Remove
        * duplicate value
        * from a HashMap
        * */
        HashMap<Integer,String> hMapTest = new HashMap<>();
        hMapTest.put(12,"Joydeep");
        hMapTest.put(32,"Host");
        hMapTest.put(11,"Test");
        hMapTest.put(54,"Basic");

        String valueToBeRemoved = "Joydeep";

        Iterator<Map.Entry<Integer,String>> itr = hMapTest.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,String> tEntry = itr.next();

            if (valueToBeRemoved.equals(tEntry.getValue())){
                itr.remove();
            }
        }
        System.out.println(" After removing value :"+hMapTest);

        // Remove elements using lambda
        String valueToBeRemoved2 = "Basic";
        hMapTest.entrySet().removeIf(e -> valueToBeRemoved2.equals(e.getValue()));
        System.out.println("Remove using lambda :"+hMapTest);
    }
}
