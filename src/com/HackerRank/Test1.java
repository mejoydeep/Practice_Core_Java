package com.HackerRank;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by JC52036 on 06-05-2019.
 */
public class Test1 {

    static void plusMinus(int[] arr) {
        int plus=0;
        int minus=0;int zero=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
               plus++;
           }
            else
               if(arr[i]<0){
                   minus++;
               }
            else if(arr[i]==0){
                   zero++;
               }
        }
        double pfrac=((double) plus/(double) arr.length);
        Double tpface= BigDecimal.valueOf(pfrac).setScale(6,BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(tpface);
        // double nfrac=(minus/a)

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        /*String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        plusMinus(arr);

        scanner.close();
    }
}
