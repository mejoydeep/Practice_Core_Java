package com.JavaPractice;

enum TraficSignal{

    Red("Stop"),Green("Go"),Yellow("Slow_Down");

    private String action;

    public String getAction(){
        return this.action;
    }

    TraficSignal(String action) {
        this.action = action;
    }
}
public class CustomizedEnum {

    public static void main(String[] args) {
        TraficSignal[] signals=TraficSignal.values();

        for (TraficSignal signal: signals){
            System.out.println("Name "+signal.name()+": Values "+signal.getAction());
        }
    }
}
