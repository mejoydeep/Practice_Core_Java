package com.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckmatchingCharecter {
    public static void main(String[] args) {
    List<String> a=new ArrayList<>();
    a.add("hello");
    a.add("hi");

    List<String> b=new ArrayList<>();
    b.add("world");
    b.add("bye");

        commonSubstring(a,b);

    }
    public static void commonSubstring(List<String> a, List<String> b) {
        // Write your code here

     /*   for(int i=0;i<a.size();i++){
            boolean flag=false;
            String a1=a.get(i);
            String a2=b.get(i);
            char[] arr=a1.toCharArray();
            for(int j=0;j<arr.length;j++){
                if(a2.indexOf(arr[j])!=-1){
                    flag=true;
                    break;
                }
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }*/

     for(int i=0;i<a.size();i++){

         boolean flag=false;
         String s=a.get(i);
         String r=b.get(i);

         Map<Character,Integer> map=new HashMap<>();

         for(int j=0;j<s.length();j++){
         map.put(s.charAt(j),map.get(s.charAt(j))==null? 1 : map.get(s.charAt(j))+1);
         }

         for (int j=0;j<r.length();j++){
             if(map.get(r.charAt(j))!=null){
                 flag=true;
                 break;
             }
         }
         if(flag)
             System.out.println("YES");
         else
             System.out.println("NO");

     }

    }
}
