package com.JavaPractice.Threading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class CallableTask implements Callable{
    public static int i=0;
    @Override
    public Object call() throws Exception {

        Random random=new Random();
        Integer randomGenerator=random.nextInt(5);
        Thread.sleep(i*1000);
        return i++;
    }
}
public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] futureTasks=new FutureTask[5];

        for (int i=0;i<5;i++){
            Callable callable=new CallableTask();

            futureTasks[i]=new FutureTask(callable);

            Thread t=new Thread(futureTasks[i]);
            t.start();
        }

        for (int i=0;i<5;i++){
            System.out.println(futureTasks[i].get());
        }
    }
}
