package com.JavaPractice;

/**
 * Created by JC52036 on 26-02-2020.
 */
interface in1{
     void m1();
}
interface in2{
    void m2();
}
interface in3 extends in2,in1{
    void m3();
}
public class Inheritance4 implements in3 {

    @Override
    public void m1() {
        System.out.println("inside 1st interface method");
    }

    @Override
    public void m3() {

    }

    @Override
    public void m2() {

    }


    public static void main(String[] args) {
        Inheritance4 obj=new Inheritance4();
        obj.m1();
    }


}
