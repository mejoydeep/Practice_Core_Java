package com.Practice;

import java.util.Scanner;

/**
 * Created by JC52036 on 28-02-2020.
 */
public class SorByBitCount {

        public static void main (String[] args)
        {
            Scanner s=new Scanner(System.in);
            int tc=s.nextInt();
            while(tc-->0){
                int size=s.nextInt();
                int[] arr=new int[size];
                for(int i=0;i<size;i++){
                    arr[i]=s.nextInt();
                }
                bitbySorting(arr,size);
            }
        }
        static void bitbySorting(int[] arr,int size){
            int aux[]=new int[size];
            for(int i=0;i<size;i++){
                aux[i] =bitCount(arr[i]);
            }
            sorting(arr,aux,size);
            printt(arr, size);

        }
        static int bitCount(int element){
            int count=0;
            while(element>0){
                if((element & 1)>0){
                    count++;
                }
                element=element>>1;
            }
            return count;
        }

        static void sorting(int[] arr, int[] aux, int size){
            for(int i=1;i<size;i++){
                int j=i-1;
                int key1=aux[i];
                int key2=arr[i];
                while(j>=0 && aux[j]>key1){
                    aux[j+1]=aux[j];
                    arr[j+1]=arr[j];
                    j--;
                }
                aux[j+1]=key1;
                arr[j+1]=key2;
            }
        }

        static void printt(int[] arr, int size){
            for(int i=size-1;i>=0;i--){
                System.out.print(" "+arr[i]);
            }
        }
    }

