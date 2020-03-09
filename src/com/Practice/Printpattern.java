package com.Practice;

/**
 * Created by JC52036 on 28-01-2020.
 */
/*Prints a pattern like :
1
3*2
4*5*6
10*9*8*7*/

public class Printpattern {
    public void arrangePattern(int lineNo){
        int count=0;
        int prevCount=0;
        for (int i=1;i<=lineNo;i++){
            prevCount=count;
            count=count+i;
            if(i%2==0){
                for(int j=count;j>prevCount;j--){
                    if(j==prevCount+1){
                        System.out.print(j);
                    }
                    else{
                        System.out.print(j+"*");
                    }
                }
            }
            else{
                for (int j=prevCount+1;j<=count;j++){
                    if(j==count){
                        System.out.print(j);
                    }
                    else{
                        System.out.print(j+"*");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Printpattern p1=new Printpattern();
        p1.arrangePattern(4);
    }
}
