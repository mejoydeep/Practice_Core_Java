package com.JavaPractice.generic;

public class CalculatorGenericMethod {

    public static <T extends Number> double add(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(CalculatorGenericMethod.add(10,3f));
    }
}
