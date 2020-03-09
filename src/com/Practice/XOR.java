package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JC52036 on 29-02-2020.
 */
public class XOR {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        // Write your code here

        int n=s.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        exor(arr, n);

    }

    static void exor(int arr[], int n){
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            int result=0;
            int max=arr[0];
            for(int j=0;j<=i;j++){
                    result= result ^ arr[j];
                    //removemax(arr,i);
            }
            System.out.println(~result);
        }
    }

    static void removemax(int arr[], int n){
        /*int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        arr[index]=Integer.MIN_VALUE;*/

    }
}
