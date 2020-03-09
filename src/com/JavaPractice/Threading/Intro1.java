package com.JavaPractice.Threading;

/**
 * Created by JC52036 on 06-03-2020.
 */
class Threadrun implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");
            System.out.println(Thread.currentThread().getState());
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }

  /*  public void run(){
        try {
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }*/


}

public class Intro1{

    public static void main(String[] args) {
        Thread obj = new Thread(new Threadrun());
        int n=9;

            obj.start();

    }
}
