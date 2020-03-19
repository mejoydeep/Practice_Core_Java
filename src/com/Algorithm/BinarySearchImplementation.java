package com.Algorithm;

/**
 * Created by JC52036 on 17-03-2020.
 */
public class BinarySearchImplementation {

    //Recursive binary search
    public int binarySearch_Recursive(int arr[], int l, int r,int x){
        if(r>=l){
            int mid=l+(r-l)/2;
            if (arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                 return binarySearch_Recursive(arr,l,mid-1,x);
            }
            return binarySearch_Recursive(arr,mid+1,r,x);
        }
        return -1;
    }

    //Iterative binary search
    public int binarySearch_Iterative(int arr[], int x){
        int l=0;
        int r=arr.length-1;
        while (l<=r){
            int mid=l+(r-l)/2;

            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                r=mid-1;
            }
               l=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchImplementation b=new BinarySearchImplementation();
        int[] arr={10,14,16,17,43,76,89};
        System.out.println(b.binarySearch_Recursive(arr,0,arr.length-1,17));

        System.out.println(b.binarySearch_Iterative(arr,17));

    }


}
