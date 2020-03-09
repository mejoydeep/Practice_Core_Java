package com.JavaPractice;

/**
 * Created by JC52036 on 14-01-2020.
 */
 class Polymorphism {
    //Overloading method
    public int sum(int x, int y) {
        return (x + y);
    }

    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    public double sum(double x, double y) {
        return (x + y);
    }


    //Public method in superclass to override
    public void show() {
        System.out.println("parent method");
    }
    private void show2(){
        System.out.println("Private Superclass method");
    }
    static void show3(){
        System.out.println("Static Superclass method");
    }
}

    class Subclass extends Polymorphism{
        //Public method in subclassclass to override
        public void show(){
            System.out.println("Overriding method");
        }

        //Can't be overridden as it's a private method
        private void show2(){
            System.out.println("Private Subclass method");
        }

        static void show3(){
            System.out.println("Static Subrclass method");
        }
    }

    class Test {

    public static void main(String[] args) {
        Polymorphism p1=new Polymorphism();
        System.out.println(p1.sum(2,6));
        System.out.println(p1.sum(4,5,9));
        System.out.println(p1.sum(4.3,8.4));

        p1.show();
        Polymorphism p2=new Subclass();
        p2.show();
        //It wiil access the superclass method.
        p2.show3();

    }

}
