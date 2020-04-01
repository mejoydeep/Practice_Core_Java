package com.JavaPractice.Threading;

class Line{

    public void getLine(){

    synchronized (this){

        System.out.println("Current thread:"+Thread.currentThread().getName());
        for(int i=0;i<3;i++){

        try {
            System.out.println("Line:"+i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


        System.out.println();
    }
}

class Train extends Thread{

    Line line;

    public Train(Line line) {
        this.line = line;
    }

    public void run(){
        line.getLine();
    }
}

public class SynchronizationMethod {

    public static void main(String[] args) {
        Line l=new Line();

        Train t1=new Train(l);
        Train t2=new Train(l);

        t1.start();
        t2.start();

    }
}
