package com.JavaPractice;

/**
 * Created by JC52036 on 05-02-2020.
 */
public class InnerClass1 {
    private int a=10;
    void oMethod(){
        System.out.println("Check it  from inner");
    }
    class Inner{
        void printMethod(){
            System.out.println("It prints inside inner a:"+a);
        }
    }

    void outerNethod(){
        int b=20;
        class Inner2{
            void innerMethod(){
                System.out.println("Inside inner method:"+b);
            }
        }
        Inner2 i2=new Inner2();
        i2.innerMethod();
    }
}
class Main{
    public static void main(String[] args) {
        InnerClass1.Inner ob=new InnerClass1().new Inner();
        ob.printMethod();

        InnerClass1 ob2=new InnerClass1();
        ob2.outerNethod();

    }
}
