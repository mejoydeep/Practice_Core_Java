package com.HackerRank;

import java.util.Scanner;

/**
 * Created by JC52036 on 14-05-2019.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        while (i-->0){
            String s1=s.next();
            String op=timeConversion(s1);
            System.out.println(op);
        }
    }

    static String timeConversion(String s) {
        String ret=s;
        String s1=ret.substring(0,2);
        int res=Integer.parseInt(s1);
        if(s.contains("PM")){
            if(res!=12)
            res+=12;
            String sp= ret.replace(s1,String.valueOf(res));
            String op=sp.replace("PM","");
            return op;
        }
        else{
            if(res==12){
                String sp= ret.replace(s1,"00");
                String op=sp.replace("AM","");
                return op;

            }
           else{
                String sp= ret.replace(s1,String.valueOf(res));
                String op=sp.replace("AM","");
                return op;
            }

        }

    }
}
