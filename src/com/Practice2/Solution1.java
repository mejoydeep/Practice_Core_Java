package com.Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution1 {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int length = A.length;
        int smallestInteger = 0 ;
        List<Integer> al =  Arrays.stream(A).boxed().collect(Collectors.toList());
        for (int a = 1 ; a<= length ; a++){
            if(!al.contains(a)){
                smallestInteger = a;
                break;
            }
        }
        if(smallestInteger == 0){
            smallestInteger = length+1;
        }
        return smallestInteger;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-1, -3};
        Solution1 Solution1 = new Solution1();

        System.out.println(Solution1.solution(arr));
    }
}
