package com.JavaPractice.lambda;

public class FuncIFImpl {

    public static int calculateValue(int a , int b, FuncInterface2 funcInterface2){
        return funcInterface2.operator(a,b);
    }

    public static void main(String[] args) {
        //Using functional interface
        FunctionalInterfaceExample fo = (x) -> System.out.println(2*x);
        fo.abstractFun(5);
        fo.normalFun();

        //Implementing the functional interface FuncInterface2
        //Example 1
        FuncInterface2 fIf1 = (x, y) -> x+y;
        System.out.println(calculateValue(10,12, fIf1));

        //Example 2
        FuncInterface2 fIf2 = (x,y) -> x*y;
        System.out.println(calculateValue(10,12, fIf2));

        //Implementing the functional interface FuncInterface3
        FuncInterface3 fIf3 = (message -> System.out.println(message));
        fIf3.printMsg("The world is beautiful");
    }
}
