package com.JavaPractice.Collection_Map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Spliterator_Stream {

    // Using Spliterators.spliteratorUnknownSize() method

    public static <T>Stream<T> iteratorSequentialStream(Iterator<T> itr){

        Spliterator<T> spliterator= Spliterators.spliteratorUnknownSize(itr,Spliterator.NONNULL);

        return StreamSupport.stream(spliterator, false);
    }

    //Using iterator.spliterator

    public static <T>Stream<T> iteratorSequentialStream2(Iterator<T> itr){

        Iterable<T> it =() ->itr;

        return StreamSupport.stream(it.spliterator(),false);
    }

    public static void main(String[] args) {

        Iterator<String> itr= Arrays.asList("Joy","Roy").iterator();

        Stream<String> stream=iteratorSequentialStream(itr);
        System.out.println(" Sequential stream :"+stream.collect(Collectors.toList()));

        Iterator<String> itr2= Arrays.asList("Foy","Toy").iterator();
        Stream<String> stream1=iteratorSequentialStream2(itr2);
        System.out.println(" Sequential stream :"+stream1.collect(Collectors.toList()));

    }
}
