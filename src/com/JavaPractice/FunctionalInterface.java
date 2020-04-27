package com.JavaPractice;

interface f1{
    int calculatesquare(int x);
}
public class FunctionalInterface {

    public static void main(String[] args) {
        int a =4;
        f1 obj=(int b)-> b*b;

        int ans=obj.calculatesquare(a);
        System.out.println(ans);
    }
}
