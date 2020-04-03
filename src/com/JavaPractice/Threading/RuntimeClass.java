package com.JavaPractice.Threading;

import java.io.IOException;

public class RuntimeClass {
    public static void main(String[] args) {
        Runtime run=Runtime.getRuntime();

        System.out.println("Runtime free memory"+run.freeMemory());
        System.out.println("Total memory :"+run.totalMemory());

        //Creates a process

        /*try {
            Process process=run.exec("google-chrome");
            System.out.println("Google Chrome has started");
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        //available processes
        System.out.println(("Available processes in JVM :"+run.availableProcessors()));

        //garbage collection
        run.gc();
        System.out.println("Garbage collector run");

        //running the finalization method
        run.runFinalization();
        System.out.println("Finalization method run");

        //maximum amount of memory java virtual machine will attempt to use
        System.out.println("Maximum memory jvm will attempt to use :"+run.maxMemory());


    }
}
