package com.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JC52036 on 10-03-2020.
 */
public class FindTriplets {

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
            int count = findtriplets(arr);
        }
    }

    public static int findtriplets(int arr[]){
        List<Integer> list= new ArrayList<>();
        for(Integer i : arr){
            list.add(i);
        }
        int count=0;
        for(int i=0;i<list.size();i++){
            int j=i+1;
            while(j<list.size()){
                if(list.contains(list.get(i)+list.get(j))){
                    count++;
                }
                j++;
            }
        }
        return count==0 ? -1: count;
    }
}
