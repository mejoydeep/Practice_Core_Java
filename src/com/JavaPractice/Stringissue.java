package com.JavaPractice;

/**
 * Created by JC52036 on 13-02-2020.
 */
public class Stringissue {
    public void test(String s){
        System.out.println("String");
    }
    public void test(Object s){
        System.out.println("Inside object");
    }
    public static void main(String[] args) {
        Stringissue s=new Stringissue();
        s.test(null);
    }
}
