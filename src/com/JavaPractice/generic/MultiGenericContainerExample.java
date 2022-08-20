package com.JavaPractice.generic;

public class MultiGenericContainerExample {

    public static void main(String[] args) {
        MultiGenericContainer<String, String> obj1 = new MultiGenericContainer("Saurav", "Associate");
        MultiGenericContainer obj2 = new MultiGenericContainer("Monday", 34.7);

        String name = obj1.getFirst();
        System.out.println("First: "+obj1.getFirst()+" Second: "+obj1.getSecond());
    }
}
