package com.JavaPractice.Threading;

public class ThreadPriority implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside run method ");
    }

    public static void main(String[] args) {

        Thread t1=new Thread(new ThreadPriority());
        System.out.println("Thread priority: main: "+Thread.currentThread().getPriority() +" t1:"+t1.getPriority());


        Thread.currentThread().setPriority(7);
        Thread t2=new Thread(new ThreadPriority());
        System.out.println("Thread priority: main: "+Thread.currentThread().getPriority() +" t2:"+t2.getPriority());

        Thread t3=new Thread(new ThreadPriority());
        Thread.currentThread().setPriority(9);
        System.out.println("Thread priority: main: "+Thread.currentThread().getPriority() +" t3:"+t3.getPriority());




    }
}
