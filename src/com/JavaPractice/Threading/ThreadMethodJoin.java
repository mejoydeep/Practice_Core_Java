package com.JavaPractice.Threading;

class ChildThread3 implements Runnable{

    @Override
    public void run() {
       /* System.out.println("Current thread :"+Thread.currentThread().getName());

        System.out.println("Is thread Alive "+Thread.currentThread().isAlive());*/

        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" is running "+i);

            try{
                Thread.sleep(750);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadMethodJoin {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1=new Thread(new ChildThread3());
        thread1.start();

        thread1.join(2000);

        Thread thread2=new Thread(new ChildThread3());
        thread2.start();

        //thread1.join();


      /*  System.out.println("\nJoining after 1000 milliseconds\n");

        System.out.println("Current thread : "+thread1.getName());

        System.out.println("Is thread Alive "+thread1.isAlive());

        System.out.println("Current thread : "+thread2.getName());

        System.out.println("Is thread Alive "+thread2.isAlive());*/


    }
}
