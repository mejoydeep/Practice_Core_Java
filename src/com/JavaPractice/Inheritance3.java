package com.JavaPractice;

/**
 * Created by JC52036 on 24-01-2020.
 */
public class Inheritance3 {
    public Inheritance3() {
        System.out.println("Super class hashcode in super: "+this.hashCode()+" : "+
                            "Super class name: "+this.getClass().getName());
    }
}

class Child extends Inheritance3{
    public Child() {
        System.out.println("Super class hashcode in child: "+super.hashCode()+" : "+super.getClass().getName()+"\n"+
                            "Child class hashcode: "+this.hashCode()+" : " +this.getClass().getName());

    }

    public static void main(String[] args) {
        Child c=new Child();
    }
}