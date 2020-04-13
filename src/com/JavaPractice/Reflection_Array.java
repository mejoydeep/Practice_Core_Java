package com.JavaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reflection_Array {
    public static void main(String[] args) {
        int sizeOfArray=5;

        int[] int_obj= (int[])Array.newInstance(int.class,sizeOfArray);

        //Setting the values to the array
        Array.setInt(int_obj,0,12);
        Array.setInt(int_obj,1,2);
        Array.setInt(int_obj,3,17);

        System.out.println(Arrays.toString(int_obj));

        //Getting the values to the array
        System.out.println();
        for (int i=0;i<sizeOfArray;i++){
            System.out.println(Array.get(int_obj,i));
        }


    }
}
