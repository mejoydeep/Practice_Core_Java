package com.JavaPractice;

public class WrapperClass {
    public static void main(String[] args) {
        Double d=new Double(10.435);

        byte b=d.byteValue();
        int i=d.intValue();

        System.out.println("Value of byte:"+b);
        System.out.println("Value of int:"+i);

        Integer i1=new Integer(13);
        System.out.println("Use of compare to method :"+i1.compareTo(12));

        Integer i2=Integer.parseInt("546");
        System.out.println("Parseint method: "+i2);


        Integer i3=12;

        System.out.println("toString() :"+i3.toString() +" : "+Integer.toString(12));

        System.out.println("Integer class"+Integer.parseInt("12",5));


    }
}
