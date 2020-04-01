package com.JavaPractice.Threading;

import java.util.Scanner;

public class ThreadWaitNotify  {

    public static void main(String[] args) throws InterruptedException {
        A a=new A();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a.produce();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a.consume();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        System.out.println("Active thread count :"+Thread.activeCount());

        System.out.println("Thread status : t1 "+t1.getState()+" t2: "+t2.getState());

        t2.start();

        System.out.println("Active thread count :"+Thread.activeCount());

        System.out.println("Thread status : t1 "+t1.getState()+" t2: "+t2.getState());


       /* t1.join();f
        t2.join();*/
    }
}

class A{

    public void produce()throws InterruptedException
    {
        // synchronized block ensures only one thread
        // running at a time.
        synchronized(this)
        {
            System.out.println("producer thread running");

            // releases the lock on shared resource
            wait();

            // and waits till some other method invokes notify().
            System.out.println("Resumed");
        }
    }

    public void consume()throws InterruptedException
    {
        // this makes the produce thread to run first.
        Thread.sleep(1000);
        Scanner s = new Scanner(System.in);

        // synchronized block ensures only one thread
        // running at a time.
        synchronized(this)
        {
            System.out.println("Waiting for return key.");
            s.nextLine();
            System.out.println("Return key pressed");

            // notifies the produce thread that it
            // can wake up.
           notify();

            // Sleep
            Thread.sleep(2000);
        }
    }
}
