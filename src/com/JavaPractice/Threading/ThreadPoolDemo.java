package com.JavaPractice.Threading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

    private String name;

    public Task(String s) {

        name=s;
    }

    @Override
    public void run() {

        for(int i=0;i<5;i++){
            try {

                if(i==0){
                    Date d=new Date();
                    SimpleDateFormat s=new SimpleDateFormat("hh-mm-ss");
                    System.out.println("Initialization time for task name :"+name+"="+s.format(d));
                }
                else{
                    Date d=new Date();
                    SimpleDateFormat s=new SimpleDateFormat("hh-mm-ss");
                    System.out.println("Running time for task name :"+name+"="+s.format(d));
                }

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name +" Completed");
    }
}
public class ThreadPoolDemo {

    static final int MAX_SIZE=3;

    public static void main(String[] args) {
        Runnable t1=new Task("task 1");
        Runnable t2=new Task("task 2");
        Runnable t3=new Task("task 3");
        Runnable t4=new Task("task 4");
        Runnable t5=new Task("task 5");

        ExecutorService executorService= Executors.newFixedThreadPool(MAX_SIZE);

        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.execute(t4);
        executorService.execute(t5);

        executorService.shutdown();




    }
}
