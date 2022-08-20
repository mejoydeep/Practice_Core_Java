package com.JavaPractice.lambda;

public interface FunctionalInterfaceExample {
    void abstractFun(int x);

    default void normalFun(){
        System.out.println("Inside default normal fun");
    }
}
