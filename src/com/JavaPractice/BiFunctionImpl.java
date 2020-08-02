package com.JavaPractice;

import java.util.function.BiFunction;

public class BiFunctionImpl {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b ;

        //Implementation of the apply() method
        System.out.println("Sum :"+add.apply(10,12));

        //Implementation of the addThen() method
        BiFunction<Integer,Integer,Integer> multiply = (d,e) -> d*e ;
        multiply = multiply.andThen(a -> 2*a);
        System.out.println("Multiply :"+multiply.apply(2,4));


    }
}
