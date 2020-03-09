package com.JavaPractice;

/**
 * Created by JC52036 on 01-03-2020.
 */

class Parent{
    int a=10;
}

class Chiild extends Parent{
   int a=100;
}
public class JavaInstanceOfExample {
    public static void main(String[] args) {
        Parent p=new Chiild();

        if(p instanceof Chiild){
            System.out.println("Parent is a instanceof Child");
            System.out.println(((Chiild) p).a+" "+p.a);
        }
    }
}
