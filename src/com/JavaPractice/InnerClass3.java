package com.JavaPractice;

/**
 * Created by JC52036 on 05-02-2020.
 */
class InnerClass3 {
    void show(){
        System.out.println("I am inside the show method of superclass");
    }
}

interface Hello{
    void helllo();
}

class AnonymousDemo{

    static InnerClass3 i1=new InnerClass3(){
      void show(){
          super.show();     //Anonymous act as a subclass but Innerclass3 act as a superclass
          System.out.println("Inside the super method of child class");
      }
    };
    static Hello hello=new Hello() {
        @Override
        public void helllo() {   //implementing the specific interface
            System.out.println("Inside interface hello method");
        }
    };

    public static void main(String[] args) {
        i1.show();
        hello.helllo();
    }

}

