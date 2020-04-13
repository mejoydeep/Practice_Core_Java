package com.JavaPractice.Threading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class WorkerClass implements Runnable{

    String name;
    ReentrantLock lock;

    public WorkerClass(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        boolean done=false;

        while(!done){
            boolean ans=lock.tryLock();
            if (ans) {
                try {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("task name - " + name
                            + " outer lock acquired at "
                            + ft.format(d)
                            + " Doing outer work");
                    Thread.sleep(1500);

                    //Getting inner lock
                    lock.lock();
                    try {
                        d = new Date();
                        ft = new SimpleDateFormat("hh:mm:ss");
                        System.out.println("task name - " + name
                                + " inner lock acquired at "
                                + ft.format(d)
                                + " Doing inner work");
                        System.out.println("Lock Hold Count - " + lock.getHoldCount());
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println("task name - " + name +
                                " releasing inner lock");

                        lock.unlock();
                    }

                    System.out.println("Lock Hold Count - " + lock.getHoldCount());
                    System.out.println("task name - " + name + " work done");
                    done=true;

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    System.out.println("task name - " + name +
                            " releasing outer lock");

                    lock.unlock();
                    System.out.println("Lock Hold Count - " +
                            lock.getHoldCount());
                }

            }
            else{
                System.out.println("task name - " + name +
                        " waiting for lock");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

public class ReentrantLockDemo {
    static final int MAZ_LOCK=2;

    public static void main(String[] args) {
        ReentrantLock re=new ReentrantLock();
        ExecutorService ex= Executors.newFixedThreadPool(MAZ_LOCK);
        Runnable r1=new WorkerClass("Job1",re);
        Runnable r2=new WorkerClass("Job2",re);
        Runnable r3=new WorkerClass("Job3",re);
        Runnable r4=new WorkerClass("Job4",re);

        ex.execute(r1);
        ex.execute(r2);
        ex.execute(r3);
        ex.execute(r4);
        ex.shutdown();



    }
}
