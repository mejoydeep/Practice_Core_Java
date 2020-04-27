package com.JavaPractice;

public class NullPassOverload {

    public void fun(int i){
        System.out.println("Value of integer :"+i);
    }

    public void fun(String s){
        System.out.println("Value of String :"+s);
    }

    public static void main(String[] args) {
        NullPassOverload obj=new NullPassOverload();

        System.out.println("Inside void main");
        obj.fun(null);
    }

    public static int main(String args){
        System.out.println("Inside int main");
        return 0;
    }
}
