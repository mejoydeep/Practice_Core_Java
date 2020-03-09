package com.Algorithm;

/**
 * Created by JC52036 on 05-03-2020.
 */
public class MergeSort {

    public void merge(int[] arr, int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;

        int L1[]=new int[n1];
        int R1[]=new int[n2];

        for (int i=0;i<n1;i++){
            L1[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R1[j]=arr[m+1+j];
        }

        int i=0; int j=0; int k=l;

        while(i<n1 && j<n2){
            if(L1[i]<=R1[j]){
                arr[k]=L1[i];
                i++;
            }
            else{
                arr[k]=R1[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k]=L1[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=R1[j];
            j++;
            k++;
        }
    }

    public void sort(int arr[], int l,int r){
        if(l<r){
            int m = (l+r)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }


    }

    public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={20,42,21,45,56,12,75};
        MergeSort ms=new MergeSort();
        ms.sort(arr,0,arr.length-1);
        ms.printArray(arr);
    }
}
