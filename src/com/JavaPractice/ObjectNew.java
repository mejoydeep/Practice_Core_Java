package com.JavaPractice;

/**
 * Created by JC52036 on 01-03-2020.
 */

class Box{
    double height;
    double width;
}
public class ObjectNew {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = b1;
        b1.height = 10;

        System.out.println(b1.height+" "+b2.height);

        b1=null;

        System.out.println(b2.height);
    }


}
