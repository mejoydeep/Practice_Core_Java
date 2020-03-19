package com.JavaPractice.String_Array;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by JC52036 on 16-03-2020.
 */
public class StringJoinerClass {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Ram");
        al.add("Shyam");
        al.add("Jodu");
        al.add("Madhu");

        StringJoiner sj=new StringJoiner(":","[","]");
        sj.setEmptyValue("sj is empty");
        System.out.println(sj);

        sj.add(al.get(0)).add(al.get(1));

        System.out.println(sj);

        sj.add("Joydeep");
        System.out.println(sj);

        StringJoiner sj2=new StringJoiner("");
        sj2.merge(sj);

        System.out.println(sj2);


    }
}
