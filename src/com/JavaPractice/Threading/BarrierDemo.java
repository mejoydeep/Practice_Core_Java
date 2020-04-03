package com.JavaPractice.Threading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Computation1 extends Thread{

    public static int product=0;

    public void run(){
        product=2*3;

        try {
            BarrierDemo.cyclicBarrier.await();

            System.out.println("Number of parties waiting at the barrier :"+ BarrierDemo.cyclicBarrier.getNumberWaiting());


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}

class Computation2 extends Thread{
    public static int sum=0;

    public void run(){
    System.out.println("Is the barrier broken :"+ BarrierDemo.cyclicBarrier.isBroken());
    sum= 10+20;

        try {
            BarrierDemo.cyclicBarrier.await(3000, TimeUnit.MILLISECONDS);
            System.out.println("Number of parties waiting at the barrier :"+ BarrierDemo.cyclicBarrier.getNumberWaiting());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}

public class BarrierDemo implements Runnable{
    public static java.util.concurrent.CyclicBarrier cyclicBarrier=new java.util.concurrent.CyclicBarrier(3);

    public static void main(String[] args) {
        Thread t1=new Thread(new BarrierDemo());
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("Number of parties required to trip thr barrier :"+cyclicBarrier.getParties());
        System.out.println("Sum + Product :"+Computation1.product+Computation2.sum);

        Computation1 c1=new Computation1();
        Computation2 c2=new Computation2();

        //child threads
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);

        t1.start();
        t2.start();

        try {
            BarrierDemo.cyclicBarrier.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }


        System.out.println("Sum + Product :"+Computation1.product+Computation2.sum);
        cyclicBarrier.reset();
        System.out.println("Barrier reseted successfully");
    }
}
