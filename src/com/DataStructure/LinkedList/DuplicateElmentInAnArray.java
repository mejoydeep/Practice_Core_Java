package com.DataStructure.LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by JC52036 on 07-02-2020.
 */
public class DuplicateElmentInAnArray {

    public void findDuplicate(int arr[]) {
        //Using Set
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.add(arr[i]) == false) {
                duplicate.add(arr[i]);
            }
        }
        for (Integer ele : duplicate) {
            System.out.println(ele);
        }

        //Using map
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : arr) {
            int count =  map.get(element);
            if (count == 0) {
                map.put(element, 1);
            } else {
                map.put(element, ++count);
            }
        }
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (mapEntry.getValue() > 1) {
                System.out.println(mapEntry.getKey());
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,4,2,6,7,8};
        DuplicateElmentInAnArray ob=new DuplicateElmentInAnArray();
        ob.findDuplicate(arr);
    }
}
