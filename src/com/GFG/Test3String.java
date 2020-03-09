package com.GFG;

import java.util.Scanner;

/**
 * Created by JC52036 on 23-03-2019.
 */
public class Test3String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        while(tc-->0){
            String s1=s.next();
            String s2=s.next();
            for(char ch='a';ch<='z';ch++){
                if(s1.indexOf(ch)>=0 &&s2.indexOf(ch)<0 || s1.indexOf(ch)<0 && s2.indexOf(ch)>=0){
                    System.out.print(ch);

                }
                else
                    continue;
            }
            System.out.println();
        }
    }
}
