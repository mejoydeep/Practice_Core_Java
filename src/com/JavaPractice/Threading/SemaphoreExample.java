package com.JavaPractice.Threading;

import java.util.concurrent.Semaphore;

class Shared{

    static int count=0;
}

class Mythread extends Thread{
    Semaphore semaphore;
    String threadnamer;

    public Mythread( Semaphore semaphore, String threadnamer) {

        super(threadnamer);
        this.semaphore = semaphore;
        this.threadnamer = threadnamer;
    }

    public void run() {

        if (this.getName().startsWith("A")) {
            System.out.println("Starting " + threadnamer);
            System.out.println(threadnamer + " is waiting for a permit ");

            try {
                semaphore.acquire();

                System.out.println(threadnamer + " gets permit");

                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(threadnamer + " " + Shared.count);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(threadnamer + " release the permit");
            semaphore.release();
        } else {

            System.out.println("Starting " + threadnamer);
            System.out.println(threadnamer + " is waiting for a permit ");

            try {
                semaphore.acquire();

                System.out.println(threadnamer + " gets permit");

                for (int i = 0; i < 5; i++) {
                    Shared.count--;
                    System.out.println(threadnamer + " " + Shared.count);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(threadnamer + " release the permit");
            semaphore.release();
        }
    }
}
public class SemaphoreExample {

    public static void main(String[] args) throws InterruptedException {
        Semaphore sem=new Semaphore(1);
        Mythread m1=new Mythread(sem,"A");
        Mythread m2=new Mythread(sem,"B");
       // Mythread m3=new Mythread(sem,"C");



        m1.start();
        m2.start();
        //m3.start();

        m1.join();
        m2.join();
      //  m3.join();

        System.out.println("Final value of shared variable is :"+Shared.count);
    }

}
