package com.JavaPractice.Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TravarseHashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Test",13);
        hm.put("Practice",54);
        hm.put("Paper",76);

        System.out.println("Iterator over :");

        Iterator itr = hm.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry mapElement = (Map.Entry) itr.next();
            int marks = (int) mapElement.getValue()+10;
            System.out.println(mapElement.getKey() +" : "+marks);
        }
        System.out.println("\nFor Each loop :");

        hm.forEach((k,v) -> System.out.println(k+ " : "+(v+10)));
    }
}
