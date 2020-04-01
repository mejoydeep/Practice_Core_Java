package com.JavaPractice.Threading;


import java.util.LinkedList;

public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
        final ProdConMethod p=new ProdConMethod();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    p.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    p.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

class ProdConMethod{

    LinkedList<Integer> linkedList=new LinkedList<>();
    int capacity=2;

    public void producer() throws InterruptedException {
        int value=0;

        while (true){
            synchronized (this){
                while (linkedList.size()==capacity)
                    wait();

                System.out.println("Producer produced: "+value);

                linkedList.add(value++);

                notify();

                Thread.sleep(1000);
            }
        }
    }

    public void consumer() throws InterruptedException {

        while (true){
            synchronized (this){
                while (linkedList.size()==0)
                    wait();

                int val=linkedList.removeFirst();

                System.out.println("Consumer consumed: "+val);

                notify();

                Thread.sleep(1000);
            }
        }
    }
}
