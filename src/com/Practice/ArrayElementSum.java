package com.Practice;

import java.util.Scanner;

/**
 * Created by JC52036 on 25-02-2020.
 */
public class ArrayElementSum {



        public static void main (String[] args)
        {
            Scanner s =new Scanner(System.in);
            int tc=s.nextInt();

            while(tc-->0){
                int size=s.nextInt();
                int sum=s.nextInt();
                int[] arr=new int[size];
                for(int i=0;i<size;i++){
                    arr[i]=s.nextInt();
                }
                findIndex(arr,sum);
            }
        }

        public static void findIndex(int arr[], int sum){
            int sIndex=-1;int eIndex=-1;
            boolean flag=false;
            for(int i=0;i<arr.length;i++){
                if(flag){
                    break;
                }
                else{
                    int tsum=0;
                    for(int j=i;j<arr.length;j++){
                        tsum+=arr[j];
                        if(tsum>sum){
                            break;
                        }
                        else
                        if(tsum==sum){
                            sIndex=i+1;
                            eIndex=j+1;
                            flag=true;
                            break;
                        }

                    }
                }
            }

            if(flag){
                System.out.println(sIndex+" "+eIndex);
            }
            else{
                System.out.println(-1);
            }
        }

}
