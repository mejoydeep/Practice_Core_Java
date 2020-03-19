package com.JavaPractice.String_Array;

import com.sun.deploy.util.SyncAccess;

/**
 * Created by JC52036 on 16-03-2020.
 */
public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Joydeep");

        System.out.println("Printing the value of the string before append :"+s);
        System.out.println("Length of StringBuffer :"+s.length());
        System.out.println("Capacity of string buffer :"+s.capacity());

        s.append(" Chakraborty");
        System.out.println("Printing the value of the string after append :"+s);
        System.out.println("Length of StringBuffer :"+s.length());
        System.out.println("Capacity of string buffer :"+s.capacity());

    }
}
