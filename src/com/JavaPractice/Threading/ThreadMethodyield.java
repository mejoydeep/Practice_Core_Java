package com.JavaPractice.Threading;

class ChildThread extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" it is");
        }
    }
}

public class ThreadMethodyield {

    public static void main(String[] args) {
      ChildThread child =new ChildThread();
      child.start();

        for (int i=0;i<5;i++){

            Thread.yield();

            System.out.println(Thread.currentThread().getName()+" in control");
        }

    }
}
