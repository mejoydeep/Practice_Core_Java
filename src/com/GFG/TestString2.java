package com.GFG;

import java.util.Scanner;

/**
 * Created by JC52036 on 23-03-2019.
 */
public class TestString2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            String sr="a100gdf456hsh";
            StringBuffer sb=new StringBuffer();
            int n=0;
            for(char c:sr.toCharArray()){
                if(sb !=null && Character.isAlphabetic(c)&& n<Integer.parseInt(sb.toString())){
                    n=Integer.parseInt(sb.toString());
                    sb.delete(0,sb.length());

                }
                if(Character.isDigit(c)){
                   // if()
                    sb.append(c);
                }
            }
            System.out.print(n);


        }
    }
}
