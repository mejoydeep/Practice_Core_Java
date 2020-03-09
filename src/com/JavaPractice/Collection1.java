package com.JavaPractice;

import java.util.*;

/**
 * Created by JC52036 on 15-01-2020.
 */
public class Collection1 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        if(hashSet.add("monu")){
            System.out.println("monu added first ");
        }
        if(hashSet.add("monu")){
            System.out.println("monu added second");
        }else
            System.out.println("monu does not added second");

    }
}
