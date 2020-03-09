package com.DataStructure.Array_String;

/**
 * Created by JC52036 on 26-02-2020.
 */
public class PermutationOfString {
    public static void main(String[] args) {
        String str="ab";
        recursion(str);

    }

    public static void recursion(String str){
        recursion("",str);
    }

    public static void recursion(String word,String str){
        if(str.isEmpty()){
            System.out.println(word+str);
        }
        else{
            for(int i=0; i<str.length();i++){
                recursion(word+str.charAt(i), str.substring(0,i)+str.substring(i+1,str.length()));
            }
        }
    }
}
