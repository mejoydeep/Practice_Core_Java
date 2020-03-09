package com.JavaPractice;

/**
 * Created by JC52036 on 07-03-2020.
 */
public class StringClass {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");
        String s4=new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s4==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s4.equals(s3));




    }
}
