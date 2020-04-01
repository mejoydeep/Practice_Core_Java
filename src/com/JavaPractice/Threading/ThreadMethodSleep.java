package com.JavaPractice.Threading;

class ChildThread2 extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
          System.out.println(Thread.currentThread().getName()+" is running "+i);

          try{
              Thread.sleep(1000);
          }
          catch (Exception e){
              e.printStackTrace();
          }
        }
    }
}

public class ThreadMethodSleep {

    public static void main(String[] args) {
        ChildThread2 c1=new ChildThread2();
        c1.start();

        ChildThread2 c2=new ChildThread2();
        c2.start();
    }

}
