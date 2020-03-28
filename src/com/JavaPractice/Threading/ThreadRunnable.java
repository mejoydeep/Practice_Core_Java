package com.JavaPractice.Threading;

public class ThreadRunnable  implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");

        }catch (Exception e){
            System.out.println("Exception is caught");
        }
    }

    public static void main(String[] args) {
        int n=9;
        for (int i=0;i<n;i++){
            Thread t=new Thread(new ThreadRunnable());
            t.start();
        }
    }
}
