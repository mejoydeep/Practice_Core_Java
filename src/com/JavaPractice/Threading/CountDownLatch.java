package com.JavaPractice.Threading;

import java.util.Date;
import java.util.concurrent.TimeUnit;

class MyThread02 extends Thread{
    private int delay;
    private java.util.concurrent.CountDownLatch latch;

    public MyThread02(int delay, java.util.concurrent.CountDownLatch latch, String name) {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    public void run(){
        try {
            Thread.sleep(delay);
            latch.countDown();
            System.out.println(Thread.currentThread().getName()+" completed ");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class CountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        java.util.concurrent.CountDownLatch latch=new java.util.concurrent.CountDownLatch(4);

        MyThread02 t1=new MyThread02(1000,latch,"first");
        MyThread02 t2=new MyThread02(2000,latch,"second");
        MyThread02 t3=new MyThread02(3000,latch,"third");
        MyThread02 t4=new MyThread02(4000,latch,"fourth");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        latch.await(3000, TimeUnit.MILLISECONDS);// It will await for the particular time and later it will release the lock
        System.out.println(Thread.currentThread().getName()+" is finished");
    }
}







