package com.JavaPractice;

public class FillInStackTrace {

    public void errormsg(){
        System.out.println(10/0);

    }

    public static void main(String[] args) throws Throwable {
        FillInStackTrace f1=new FillInStackTrace();

        try {
            f1.errormsg();
        }
        catch (Exception e){
            e.printStackTrace();
            throw e.fillInStackTrace();
        }
    }
}
