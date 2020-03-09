package com.JavaPractice;

/**
 * Created by JC52036 on 14-02-2020.
 */
public class ARMJava {
    public static void main(String[] args)  throws Exception{
        try (Demo1 d=new Demo1();){
           System.out.println(10/0);
        }
        catch (ArithmeticException e){

        }
    }

}
class Demo1 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Inside close of 'Demo1' ");
    }
    /*public void close(){

    }*/

}
