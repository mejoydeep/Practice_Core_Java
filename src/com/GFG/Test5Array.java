package com.GFG;

import java.util.Scanner;

/**
 * Created by JC52036 on 26-04-2019.
 */
 class Height{
    int feet;
    int inches;
    public Height(int feet,int inches){
        this.feet=feet;
        this.inches=inches;
    }
}
public class Test5Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        while (tc-->0){
            int n=s.nextInt();
            Height arr[]=new Height[n];
            for (int i=0;i<n;i++){
                int tem1=s.nextInt();
                int tem2=s.nextInt();
                arr[i]=new Height(tem1,tem2);
            }
            Cal cal=new Cal();
            int res= Cal.findMax(arr,n);
            System.out.println(res);
        }
    }
}

class Cal{
    public static int findMax(Height a[],int n){
        int max=0;
        int cal=0;
        for(int i=0;i<n;i++){
          cal=(a[i].feet*12) +a[i].inches;
            if(max<cal)
                max=cal;
        }
        return max;


    }
}
