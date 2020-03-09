package com.DataStructure.Array_String;

/**
 * Created by JC52036 on 26-02-2020.
 */
public class ReverseString {
    public static void main(String[] args) {
        String s ="SasAs";
        System.out.println("Revers of a string: "+reverseString(s));

        System.out.println("Check the string is pallindrome :"+checkPallindrome(s));

    }

    //Recverse of a string

    public static String reverseString(String str){
        int i=0;
        int j=str.length()-1;
        char[] ch=str.toCharArray();
        while(i<j){
            char swap=ch[i];
            ch[i]=ch[j];
            ch[j]=swap;
            i++;
            j--;
        }
        return new String(ch);

    }

    //Check if the string is pallindrome or not

    public static boolean checkPallindrome(String str){
        int i=0;
        int j=str.length()-1;
        char[] ch=str.toCharArray();
        while (i<j){
            if(ch[i]!=ch[j] ){
                if(Math.abs(ch[i]-ch[j])!=32){
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
}
