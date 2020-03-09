package com.JavaPractice;

/**
 * Created by JC52036 on 04-02-2020.
 */
public class ThisTest {
    int a;
    int b;

    ThisTest(){
        this(10,20);
        System.out.println("Inside this constructor call");
    }
    ThisTest(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Inside Parameterarized constructor");
    }

    //Using this as a method argument of current class
    void display1(){
        print1(this);
    }

    void print1(ThisTest t1){
        System.out.println("a= "+a+" b="+b);
    }

    //Using "this" keyword to invoke current class method
    void display2(){
        this.print2();
    }
    void print2(){
        System.out.println("a= "+this.a+" b="+this.b);
    }


    public static void main(String[] args) {
        ThisTest t1=new ThisTest();
        t1.display1();
        t1.display2();
    }
}
