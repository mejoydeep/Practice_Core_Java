package com.JavaPractice.Threading;

import java.util.Random;

class RunnableDemo implements Runnable{

    private Object result=null;

    @Override
    public void run() {
        Random random=new Random();
        Integer randomGenerator=random.nextInt(5);

        try {
            Thread.sleep(randomGenerator *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        result=randomGenerator;

        synchronized (this){
            notifyAll();
        }
    }

    public synchronized Object get() throws InterruptedException {
        if (result==null){
            wait();
        }
        return result;
    }
}

public class RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        RunnableDemo[] runnableDemos=new RunnableDemo[5];

        for (int i=0;i<5;i++){
            runnableDemos[i]=new RunnableDemo();

            Thread t=new Thread(runnableDemos[i]);
            t.start();
        }

        for (int i=0;i<5;i++){
            System.out.println(runnableDemos[i].get());
        }
    }
}
