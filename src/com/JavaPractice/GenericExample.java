package com.JavaPractice;

//GENERIC CLASS can have single or multiple parameter type

class TestG<T, U>{

    T tobj;
    U uobj;

    public TestG(T tobj, U uobj) {
        this.tobj = tobj;
        this.uobj = uobj;
    }

    public  void printGeneric(){
        System.out.println(tobj.getClass().getName()+" : "+tobj);
        System.out.println(uobj.getClass().getName()+" : "+uobj);
    }


    //GENERIC METHOD
    public <F> void genMethod(F element){
        System.out.println(element.getClass().getName()+" : "+element);
    }
}

public class GenericExample {

    public static void main(String[] args) {
        TestG<String,Integer> obj=new TestG<>("Joy",10);
        obj.printGeneric();
        obj.genMethod(12);
    }
}
