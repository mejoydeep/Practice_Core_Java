package com.JavaPractice.Threading;

/**
 * Created by JC52036 on 06-03-2020.
 */
class MultiThreadApp extends Thread{

    public void run(){
        try{
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public  class ThreadCall{
    public static void main(String[] args) {
        int n=7;
        for (int i=0;i<n;i++){
            MultiThreadApp m=new MultiThreadApp();
            m.start();
        }
    }
}
