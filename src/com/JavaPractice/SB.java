package com.JavaPractice;

public class SB {
    static  int i;
    int j;
    static {
        i=10;
        System.out.println("Inside static block ");
    }

    public SB() {
        System.out.println("Inside the constructor");
    }

    public static void main(String[] args) {
        System.out.println("Value of i is :"+SB.i);

        SB s1=new SB();
        SB s2=new SB();
    }
}
