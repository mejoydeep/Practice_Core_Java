package com.Algorithm;

/**
 * Created by JC52036 on 08-02-2020.
 */
public class QuickSort {

    void quickSort(int arr[],int low, int high){
        if(low<high){
            int partition=partition(arr,low,high);

            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }

    }

    public int partition(int arr[], int low, int high){
       int pivot=arr[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if (arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public void printArray(int arr[]){
        for(Integer i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort ob=new QuickSort();
        int arr[]={10,80,30,90,40,50,70};
        ob.quickSort(arr,0,arr.length-1);
        ob.printArray(arr);

    }
}
