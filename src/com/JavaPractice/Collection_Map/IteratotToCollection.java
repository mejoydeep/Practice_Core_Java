package com.JavaPractice.Collection_Map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class IteratotToCollection {

    public static <E> Collection<E> makeCollection1(Iterable<E> iter) {
        Collection<E> list = new ArrayList<E>();
        for (E item : iter) {
            list.add(item);
        }
        return list;
    }

    public static <T> Collection<T> makeCollection2(Iterable<T> iter){

        Collection<T> list = new ArrayList<T>();

        Iterator<T> iterator=iter.iterator();

        while (iterator.hasNext()){
            list.add(iterator.next());
        }

        return list;
    }

    public static <E> Collection<E> makeCollection3(Iterable<E> iter){
        Collection<E> col=new ArrayList<E>();

        iter.forEach(col :: add);

        return col;
    }

    public static <E> Collection<E> makeCollection4(Iterable<E> iter){

        return StreamSupport.stream(iter.spliterator(),false).collect(Collectors.toList());


    }
    public static void main(String[] args) {
        IteratotToCollection o1=new IteratotToCollection();

        Iterable<Integer> it= Arrays.asList(12,13,14,15);

        Collection<Integer> col=o1.makeCollection1(it);

        System.out.println("Printing the collection from utility function:"+col);

        System.out.println("Printing the function from iterator:"+makeCollection2(it));

        System.out.println("Printing the function from for-Each:"+makeCollection3(it));

        System.out.println("Printing the function from stream:"+makeCollection4(it));



    }
}
