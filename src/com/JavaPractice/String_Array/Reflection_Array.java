package com.JavaPractice.String_Array;

import java.lang.reflect.Array;

public class Reflection_Array {
    public static void main(String[] args) {
        int arr[]=(int[]) Array.newInstance(int.class,3);

        Array.setInt(arr,0,1);
        Array.setInt(arr,1,3);
        Array.setInt(arr,2,5);


        for (int i=0;i<arr.length;i++) {
            System.out.print(Array.getInt(arr,i)+" ");
        }
    }
}
