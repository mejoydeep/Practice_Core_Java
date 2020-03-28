package com.JavaPractice;

class Parentt{

    public Parentt() {
    }

    void m1() throws RuntimeException{
        System.out.println("Inside Parent");
    }
}

public class Exception_Chaining extends Parentt {
    public Exception_Chaining() {
        super();
    }

    void m1() throws NullPointerException{
       System.out.println("Inside Child");
    }

    public static void main(String[] args) {
        Parentt e=new Exception_Chaining();
        e.m1();

    }



}
