package com.JavaPractice.IOOperationn_Stream;

import java.util.Scanner;

/**
 * Created by JC52036 on 13-03-2020.
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int count=0;

        while (s.hasNextInt()){
            int num=s.nextInt();
            sum+=num;
            count++;
        }
        int mean=sum/count;
        System.out.print("Mean:"+mean);
    }
}
