package com.JavaPractice.String_Array;

import java.util.StringTokenizer;

/**
 * Created by JC52036 on 16-03-2020.
 */
public class StringTokenizerClass {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("JAVA : Code : String", " :", true); // It makes the delimiter character print as it is true, By default it is false

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        StringTokenizer st2=new StringTokenizer("JAVA : Code : String", " :");

        while (st2.hasMoreElements()){
            System.out.println(st2.nextElement());
        }
    }
}
