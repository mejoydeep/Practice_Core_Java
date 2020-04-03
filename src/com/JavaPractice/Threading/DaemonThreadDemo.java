package com.JavaPractice.Threading;

class Resource extends Thread{

    public void run(){

        if (Thread.currentThread().isDaemon()){

            System.out.println(Thread.currentThread().getName()+" is a daemon thread");
        }
        else {
            System.out.println(Thread.currentThread().getName()+" is a user thread");
        }
    }
}
public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Resource r1=new Resource();
        Resource r2=new Resource();
        Resource r3=new Resource();

        r1.setDaemon(true);
        r1.start();
        r2.start();
        r3.start();
        r3.setDaemon(true); //It will throw "IllegalStateException" as the user thread is already started

        r1.sleep(10000);


    }
}
