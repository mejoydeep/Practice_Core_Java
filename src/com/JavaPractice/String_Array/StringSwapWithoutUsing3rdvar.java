package com.JavaPractice.String_Array;

/**
 * Created by JC52036 on 17-03-2020.
 */
public class StringSwapWithoutUsing3rdvar {
    public static void main(String[] args) {
        String a="Joydeep";
        String b="Chakraborty";
        System.out.println("Value of a: "+a+" Value of b :"+b);
        a=a + b;

        b=a.substring(0,a.length()-b.length());

        a=a.substring(b.length());
        System.out.println("Value of a: "+a+" Value of b :"+b);

    }
}
