package com.GFG;

import java.util.Scanner;

/**
 * Created by JC52036 on 23-03-2019.
 */
public class TestString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while (tc-- > 0) {
            String st = s.next();
            //System.out.println(printRep(st));
            printRep(st);
        }
    }
    public static void printRep(String st){
        char ch[]=st.toCharArray();
        char op=' ';
        boolean flag=false;
        for(int i=0;i<ch.length;i++){
            if(i!=(ch.length-1)&& ch[i]==ch[i+1])
                op=ch[i];
                flag=true;
                break;
        }
        if(flag)
            System.out.println(op);
        else
            System.out.println(-1);
    }
}
