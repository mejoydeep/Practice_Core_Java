package com.GFG;

import java.util.Scanner;

/**
 * Created by JC52036 on 30-04-2019.
 */
public class Test5String {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        while(tc-->0){
            String str=s.next();
            StringBuilder cal=null;
            char ch[]=str.toCharArray();
            for(int i=0;i<str.length();i++){
                if(cal ==null){
                    cal.insert(i,str.charAt(i));
                }
                else
                if(!cal.toString().contains(Character.toString(str.charAt(i)))){
                    cal.insert(i,str.charAt(i));
                }
            }
            System.out.println(cal.length());
        }
    }
}
