package com.JavaPractice;

abstract class AbstractClass{

    public AbstractClass() {
        System.out.println("Inside abstract class constructor");
    }

    abstract void m1();

     void m2(){
        System.out.println("Inside non-abstract method");
    }

    final void m3(){
        System.out.println("Inside final method");
    }

}

public class Abatract_Practice extends AbstractClass{
    public Abatract_Practice() {
    }

    @Override
    void m1() {
        System.out.println("Abstract method implementation in child class");
    }

    public static void main(String[] args) {
        AbstractClass a =new Abatract_Practice();
        a.m1();
        a.m2();
        a.m3();
    }
}
