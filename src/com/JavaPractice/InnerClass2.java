package com.JavaPractice;

/**
 * Created by JC52036 on 05-02-2020.
 */
public class InnerClass2 {
    private static void outerMethod(){
        System.out.println("inside outer method");
    }

    static class Inner{
        public static void main(String[] args) {
            System.out.println("Inside static inner");
            outerMethod();
        }
    }
}
