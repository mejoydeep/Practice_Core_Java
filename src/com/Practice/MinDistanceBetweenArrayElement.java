package com.Practice;

import java.util.Vector;

/**
 * Created by JC52036 on 03-03-2020.
 */
public class MinDistanceBetweenArrayElement {
    public static void main(String[] args) {
        int arr[]= {1,2};
        System.out.println(findMinDistanceForMinimum(arr));
    }

    public static int findMinDistanceForMinimum(int[] str){
        int min=Integer.MAX_VALUE;

        for(int i=0;i<str.length;i++){
            if(str[i]<min){
                min=str[i];
            }
        }

        Vector<Integer> vList=new Vector<>();
        for (int j=0;j<str.length;j++){
            if(str[j]==min){
                vList.add(j);
            }
        }

        if(vList.size()<2){
            return -1;
        }

        int min_distance=Integer.MAX_VALUE;
        for (int k=1;k<vList.size();k++){
            if(vList.get(k)-vList.get(k-1)<min_distance){
                min_distance=vList.get(k)-vList.get(k-1);
            }
        }

        return min_distance;
    }
}
