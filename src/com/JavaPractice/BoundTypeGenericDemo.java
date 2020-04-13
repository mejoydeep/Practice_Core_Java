package com.JavaPractice;

class Bound<T extends S>{
    private T objRef;

    public Bound(T objRef) {
        this.objRef = objRef;
    }
    public void getType(){
        objRef.displayClass();
    }
}
class S{
    public void displayClass(){
        System.out.println("Inside A class");
    }
}

class S1 extends S{
    public void displayClass(){
        System.out.println("Inside S1 class");
    }

}
public class BoundTypeGenericDemo {

    public static void main(String[] args) {
        Bound<S> obj1=new Bound<S>(new S());
        obj1.getType();

        Bound<S1> obj2=new Bound<>(new S1());
        obj2.getType();

    }
}
