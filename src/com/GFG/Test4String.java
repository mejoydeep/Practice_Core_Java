package com.GFG;

import java.util.Scanner;

/**
 * Created by JC52036 on 25-03-2019.
 */
public class Test4String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        System.out.println(anagramC(s1,s2));
    }
    public static int anagramC(String s1,String s2){
        int count=0;
        /*char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        boolean flag[]=new boolean[s2.length()];
        for(int i=0;i<s1.length();i++){
           if()
        }*/
        if(s1.length()<s2.length())
           count= checkAnagram(s1,s2);
        else if(s2.length()<s1.length())
            count=checkAnagram(s2,s1);

        return count;
    }
    public static int checkAnagram(String s1,String s2){
        int count=0;
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        boolean[] flag=new boolean[c2.length];
        for(int i=0;i<c1.length;i++){
            for (int j=0;j<c2.length;j++){
                if(!flag[j] && c1[i]==c2[j]){
                    flag[j]=true;
                    break;
                }

            }
        }
        for(int k=0;k<flag.length;k++){
            if(!flag[k])
             count++;
        }
        return count;
    }
}
