package com.JavaPractice;

class AA implements Cloneable{
    int data;
    String name;

    public AA(int data, String name) {
        this.data = data;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class CloneImplimentation {

    public static void main(String[] args) throws CloneNotSupportedException {
        AA o1=new AA(10,"Bastab");

        AA o2=(AA) o1.clone();

        o2.data=14;
        o2.name="Muni";
        System.out.println(o1.data+" "+o1.name);
        System.out.println(o2.data+ " "+o2.name);
    }
}
