package com.JavaPractice;

class A{
    {
        System.out.println("Inside instance initialization block of parent");
    }

    public A() {
        System.out.println("Inside constructor of parent");

    }
}
public class IIB extends  A{
    {
        System.out.println("Inside instance initialization block of child");
    }

    public IIB() {
        super();
        System.out.println("Inside constructor of child");
    }

    public static void main(String[] args) {
        IIB i=new IIB();
        System.out.println();
        IIB i2=new IIB();

    }

}


