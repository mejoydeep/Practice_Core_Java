package com.Practice;

import java.util.Scanner;

/**
 * Created by JC52036 on 02-03-2020.
 */
public class ReverseVowelInString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();

        ReverseVowelInString r1=new ReverseVowelInString();
        System.out.println(r1.vowelRev(str));
    }

    public String vowelRev(String abc){
        char[] str=abc.toCharArray();
        int i=0;
        int j=abc.length()-1;

        while (i<j){
            if( !isVowel(str[i])){
                i++;
            }
            if( !isVowel(str[j])){
                j--;
            }
            if(isVowel(str[i]) && isVowel(str[j])){
              char ch=str[i];
                str[i]=str[j];
                str[j]=ch;
                i++;
                j--;
            }
        }
        return new String(str);
    }

    public boolean isVowel(char c){
        return (c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U');
    }
}
