package com.Practice;

/**
 * Created by JC52036 on 27-02-2020.
 */
public class BinaryRepresentation {
    public static void main(String[] args) {
        BinaryRepresentation b1=new BinaryRepresentation();
        //b1.binary(14);
        System.out.println();
        b1.binaryUsingBitwise(14);
    }

    public void binary(int n){
       if(n>1){
        binary(n/2);
       }
        System.out.print( n%2);
    }

    //Using bitwise operator

    public void binaryUsingBitwise(int n){
        if(n>1){
            binaryUsingBitwise(n>>1);
        }
        System.out.print(n&1);
    }
}
