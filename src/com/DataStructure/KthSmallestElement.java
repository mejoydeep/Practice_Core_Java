package com.DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by JC52036 on 08-02-2020.
 */
public class KthSmallestElement {
    public int checkKthElemet(int arr[], int k){
        int kth=0;
        int min=0;
        int temp=0;
        int length=arr.length;
        boolean[] index=new boolean[length];
        for(int i=0;i<length;i++){
          /*  if (!index[i]){
                min=arr[i];
                temp=i;
            }
            else{
                continue;
            }*/

                for (int j=0;j<length;j++){
                    if (arr[j]<min && !index[j]){
                        min=arr[j];
                        temp=j;
                    }
                }
                kth++;
                index[temp]=true;
                if(kth==k){
                    break;
                }
            }

        return arr[temp];
    }

    public int minArr(int arr[], int k){
        List<Integer> list=new ArrayList<>();
        for (Integer i:arr){
            list.add(i);
        }
        Collections.sort(list);

        return list.get(k-1);
    }

    public static void main(String[] args) {
        KthSmallestElement obj=new KthSmallestElement();
        int arr[]={10,30,23,21,54,26};
        System.out.println(obj.minArr(arr,6));
    }

}
