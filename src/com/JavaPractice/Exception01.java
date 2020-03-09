package com.JavaPractice;

import java.io.IOException;

/**
 * Created by JC52036 on 06-02-2020.
 */
public class Exception01 {
    static int dividedByZero(int a, int b){
        int i = a/b;
        return i;
    }

    static int computeDivision(int a, int b) {

        int res =0;

        try
        {
            res = dividedByZero(a,b);
        }
        // doesn't matches with ArithmeticException
        catch(NumberFormatException ex)
        {
            System.out.println("NumberFormatException is occured");
        }
        return res;
    }

    public static void main(String[] args) {
        int a =1;
        int b=0;

        try
        {
            int i = computeDivision(a,b);

        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("Exception is caught");
        }
    }

}
