package com.JavaPractice.String_Array;

/**
 * Created by JC52036 on 15-03-2020.
 */
public class ArrayRotationClass1 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int d=3;

        //method 1
        int met1[]=method1(arr,d);
        for (Integer i:
             arr) {
            System.out.print(i+" ");
        }

        //method 2
        System.out.println();
        int[] arr2={1,2,3,4,5,6,7,8};
        int met2[]=method2(arr2,d);
        for (Integer i:arr2){
            System.out.print(i+" ");
        }

        //method 3
        System.out.println();
        int[] arr3={1,2,3,4,5,6,7,8};
        int met3[]=method2(arr3,6);
        for (Integer i:arr3){
            System.out.print(i+" ");
        }

    }

    public static int[] method1(int arr[], int d){
        int temp[]=new int[d];
        int n=arr.length;
        for(int i=0;i<d;i++){
           temp[i]=arr[i];
        }

        for(int i=0;i+d<n;i++){
            arr[i]=arr[i+d];
        }

        for(int i=0;i+(n-d)<n;i++){
            arr[i+n-d]=temp[i];
        }
        return arr;
    }

    public static int[] method2(int arr[], int d){
        int n=arr.length;
        for (int i=0;i<d;i++){
            int temp=arr[0];
            for (int j=1;j<n;j++){
                arr[j-1]=arr[j];
            }
            arr[n-1]=temp;
        }
        return arr;
    }

    //jumble algorithm
    public static int[] method3(int arr[], int d){

        int i,j,k,temp;
        int n=arr.length;
       int g_c_d=gcd(d,n);

        for (i=0;i<g_c_d;i++){
            temp=arr[i];
            j=i;
            while (true){
                k=j+d;
                if (k>=n){
                    k=k-n;
                }
                if(k==i){
                    break;
                }
                arr[j]=arr[k];
            }
            arr[j]=temp;
        }
        return arr;
    }

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
