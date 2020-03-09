package com.JavaPractice;

/**
 * Created by JC52036 on 24-01-2020.
 */
public class Inheritance2 {
    public void class1(){
        System.out.println("Inside parent");
    }

}

class Intermidiary extends Inheritance2{
    public void inter(){
        System.out.println("Intermediary");
    }
}
class child extends Intermidiary{
    public void childd(){
        System.out.println("Child");
    }
}

class ClaaingClass{
    public static void main(String[] args) {
        child c=new child();
        c.childd();
        c.inter();
        c.class1();
    }
}
