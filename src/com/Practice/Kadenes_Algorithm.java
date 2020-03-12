package com.Practice;

import java.util.Scanner;

/**
 * Created by JC52036 on 10-03-2020.
 */
public class Kadenes_Algorithm {
    public static void main (String[] args)
    {
        Scanner s =new Scanner(System.in);
        int tc=s.nextInt();

        while(tc-->0){
            int size=s.nextInt();
            int[] arr=new int[size];

            for(int i=0;i<size;i++){
                arr[i]=s.nextInt();
            }
            System.out.println(maxSumSubarray(arr));

        }
    }

    public static int maxSumSubarray(int[] a){
        int curr_sum=a[0];
        int sum=a[0];

        for(int i=1;i<a.length;i++){
            if(curr_sum+a[i]> a[i]){
                curr_sum=curr_sum+a[i];
            }
            else{
                curr_sum=a[i];
            }

            if(sum<curr_sum){
                sum=curr_sum;
            }
        }

        return sum;
    }
}
