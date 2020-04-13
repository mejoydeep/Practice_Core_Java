package com.JavaPractice;

enum Color{
    RED,GREEN,YELLOW;
}
public class EnumDemo {
    public static void main(String[] args) {
        Color c1=Color.GREEN;

        System.out.println(c1);

        Color[] arr=Color.values();

        for (Color c: arr){
            System.out.println(c +" index is at "+c.ordinal());
        }

        System.out.println(Color.valueOf("RED"));
    }
}
