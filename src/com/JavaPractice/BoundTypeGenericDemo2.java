package com.JavaPractice;

interface P{
    public void displayClass();
}

class  P1 implements P{

    @Override
    public void displayClass() {
        System.out.println("Inside Super P1");
    }
}

class P2 extends P1{
    public void displayClass() {
        System.out.println("Inside Child P2");
    }
}

class  Bound2<T extends P1 & P>{
    private T objRef;

    public Bound2(T objRef) {
        this.objRef = objRef;
    }

    public void getDetails(){
        objRef.displayClass();
    }
}


public class BoundTypeGenericDemo2 {
    public static void main(String[] args) {
        Bound2<P1> obj1=new Bound2<>(new P1());
        obj1.getDetails();

       /* Bound2<P> obj2=new Bound2<P>(new P() {
            @Override
            public void displayClass() {
                System.out.println("Inside the interface method");
            }
        });*/

        Bound2<P2> obj3=new Bound2<>(new P2());
        obj3.getDetails();

    }

}
