package com.JavaPractice.String_Array;

import java.sql.Array;
import java.util.Arrays;

public class Arrays_Method {
    public static void main(String[] args) {
        int arr[]={10,17,16,20,43};
        System.out.println("Arrays as sort :"+ Arrays.asList(arr));

        Arrays.sort(arr);

        System.out.println("Binary Search :"+Arrays.binarySearch(arr,17));

        int arr2[]={10,12};

        //copyOf() copies the array and creates a new array with the size of 10
        System.out.println("Copying 2 arrays :"+ Arrays.toString(Arrays.copyOf(arr,10)));

        //copyOfRance() copy from a particular range till a particular range
        System.out.println("Copying 2 arrays :"+ Arrays.toString(Arrays.copyOfRange(arr,1,3)));


        int intArr[][] = { { 10, 20, 15, 22, 35 } };

        int intArr1[][] = { { 10, 15, 22 } };

        Integer intarr2[]={10,20};

        Integer intarr3[]={10,20};

        System.out.println("Deep equals :"+Arrays.deepEquals(intArr1,intArr));

        //For 1-d array the data type should be of type Wrapper not premitive

        System.out.println("Deep equals for 2 one-dimensional arrays:"+Arrays.deepEquals(intarr2,intarr3));


        //Returns the hashcode based on the deep contents of the array.
        System.out.println("Deep hashcode of an array :"+Arrays.deepHashCode(intarr2)+" "+Arrays.deepHashCode(intarr3));

        //Arrays.fill() method fills the specific value in the array.
        int arr4[]= {43,62,12,47,98};

        int key=100;

        Arrays.fill(arr4,key);
        for (Integer i : arr4) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr4));


        //Converting array to Spliterator
        int arr5[]={54,87,34,98,12};
        System.out.println("Spliterator of the array :"+Arrays.spliterator(arr5));

    }
}
