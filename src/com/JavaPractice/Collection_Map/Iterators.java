package com.JavaPractice.Collection_Map;

import java.util.*;

/**
 * Created by JC52036 on 05-03-2020.
 */
public class Iterators {
    public static void main(String[] args) {

        //Enumaration with vector

        Vector v =new Vector();
        for (int i =0;i<10;i++){
            v.add(i);
        }
        Enumeration e=v.elements();

        while (e.hasMoreElements()){
            int i=(Integer) e.nextElement();
            System.out.print(i+" ");
        }

        System.out.println();


        //Iterator in java

        System.out.println("Iterator");

        ArrayList al=new ArrayList();
        for (int i=0;i<10;i++){
            al.add(i);
        }

        Iterator it=al.iterator();
        while (it.hasNext()){
            int i=(Integer) it.next();
            System.out.print(i+" ");

            if(i%2 !=0){
                it.remove();
            }
        }
        System.out.println();
        System.out.println(al);

        //List iterator in java
        System.out.println("List Iterator: ");

        ArrayList al2=new ArrayList();
        for (int i=0;i<10;i++){
            al2.add(i);
        }

        ListIterator listIterator=al2.listIterator();
        System.out.println("Displaying list elements in forward direction :");
        while (listIterator.hasNext()){
            int i=(Integer) listIterator.next();
            System.out.print(" index "+listIterator.nextIndex()+" : "+i+"\t-> ");
        }

        System.out.println("\nDisplaying list elements in backward direction :");
        while (listIterator.hasPrevious()){
            int j=(Integer)listIterator.previous();
            System.out.print(" index "+listIterator.previousIndex()+" : "+j+"\t-> ");
        }
    }
}
