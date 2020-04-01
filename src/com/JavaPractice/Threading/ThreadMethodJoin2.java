package com.JavaPractice.Threading;

class ThreadJoning extends Thread{

    public void run(){
        for (int i=0;i<2;i++){

            try {
                Thread.sleep(500);
                System.out.println("Current thread :"+Thread.currentThread().getName()+" i "+i) ;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
    }
}
public class ThreadMethodJoin2 {
    public static void main(String[] args) {
        ThreadJoning t1=new ThreadJoning();
        ThreadJoning t2=new ThreadJoning();
        ThreadJoning t3=new ThreadJoning();

        t1.start();

        try {

            System.out.println("Current thread :"+Thread.currentThread().getName()) ;

            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        try {
            System.out.println("Current thread :"+Thread.currentThread().getName()) ;
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
    }
}
