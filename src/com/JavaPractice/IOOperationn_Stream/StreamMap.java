package com.JavaPractice.IOOperationn_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by JC52036 on 13-03-2020.
 */
public class StreamMap {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("geeks","surya","Joydeep","Chiraag");

        list.stream().map(str->str.toUpperCase()).forEach(System.out::println);

        List<Integer> string=list.stream().map(str->str.length()).collect(Collectors.toList());
        System.out.println(string);
    }
}
