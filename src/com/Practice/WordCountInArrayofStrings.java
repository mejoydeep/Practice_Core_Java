package com.Practice;

/**
 * Created by JC52036 on 03-03-2020.
 */
public class WordCountInArrayofStrings {
    public static void main(String[] args) {
        int totalWordCount=0;
        String[] strArr={"Sai Pangu", "Joy Chak", "Sidd \nRev", "Pallavi Reddi"};
        for (int i=0;i<strArr.length;i++){
            totalWordCount+=wordCount(strArr[i]);
        }

        System.out.println(totalWordCount);

    }

    public static int wordCount(String str){
        boolean state=true;
        int wc=0;
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)==' ' || str.charAt(i)=='\t'
                    || str.charAt(i)=='\n'){
                state=true;
            }
            else if(state==true){
                state=false;
                ++wc;
            }
            ++i;
        }
        return wc;
    }
}
