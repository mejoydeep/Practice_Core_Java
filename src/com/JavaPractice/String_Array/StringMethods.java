package com.JavaPractice.String_Array;

/**
 * Created by JC52036 on 13-03-2020.
 */
public class StringMethods {
    public static void main(String[] args) {
        String s1="GeeksForGeeks";

        System.out.println("Substring of the string :"+ s1.substring(3));

        String s2="Surya";
        String s3="KantaGiri";
        System.out.println("Concatinating 2 strings :"+s2.concat(s3));

        String s4="Learn share learn";
        System.out.println("Index of share :"+s4.indexOf("share"));

        String s5="Karan";
        String s6="Kiran";

        int compare=s5.compareTo(s6);
        System.out.println("CompareTo method :"+compare);
    }
}
