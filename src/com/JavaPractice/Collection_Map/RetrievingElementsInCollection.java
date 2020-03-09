package com.JavaPractice.Collection_Map;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by JC52036 on 06-03-2020.
 */
public class RetrievingElementsInCollection {
    public static void main(String[] args) {

        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Sai");
        hashSet.add("Joydeep");
        hashSet.add("Rohit");

        //Using for-Each
        for (String st: hashSet){
            System.out.println(st);
        }

        //using lambda in java 8
        System.out.println();
        hashSet.forEach(e -> System.out.println(e));

        //Using iteratot
        System.out.println();
        Iterator it=hashSet.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Using ListIterator
        System.out.println();
        List<String> list=new ArrayList<>(hashSet);

        ListIterator listIterator=list.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next()+" Next Index "+listIterator.nextIndex()+" Previous Index "+listIterator.previousIndex());
        }
        System.out.println();
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous()+" Next Index "+listIterator.nextIndex()+" Previous Index "+listIterator.previousIndex());
        }


    }
}
