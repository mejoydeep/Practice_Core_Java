package com.JavaPractice.Collection_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by JC52036 on 05-03-2020.
 */
public class ConvertIterableIntoCollection {

    public static <T>Collection<T> getCollectionThroughforLoop(Iterable<T> itr){
        Collection c=new ArrayList<>();

        for (T t : itr){
            c.add(t);
        }

        return c;
    }

    public static <T>Collection<T> getCollectionThroughforEach(Iterable<T> itr){
        Collection c=new ArrayList<>();

        itr.forEach(c::add);

        return c;
    }

    public static <T>Collection<T> getCollectionThroughStream(Iterable<T> itr){
        Collection c=new ArrayList<>();

        return StreamSupport.stream(itr.spliterator(),false).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        Iterable<Integer> it= Arrays.asList(1,2,3,4);
        System.out.println("Iterable list :"+it);

        Collection<Integer> col=getCollectionThroughforLoop(it);
        System.out.println("Collection list using for :"+col);

        Collection<Integer> col2=getCollectionThroughforEach(it);
        System.out.println("Collection list using for-Each :"+col2);

        Collection<Integer> col3=getCollectionThroughStream(it);
        System.out.println("Collection list using stream :"+col3);
    }
}
