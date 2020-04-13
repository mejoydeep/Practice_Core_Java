package com.JavaPractice;

public class ShutdownHookDemo {

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(){
            public void run(){
                System.out.println("Shutdown hook is running");
            }

        });
        System.out.println("Application terminating ");
    }
}
