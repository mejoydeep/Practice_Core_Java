package com.JavaPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TestClass{

    private String s;

    public TestClass(){
        s="GeeksForGeeks";
    }

    public void method1()  {
        System.out.println("The string is " + s);
    }

    public void method2(int n)  {
        System.out.println("The number is " + n);
    }

    private void method3() {
        System.out.println("Private method invoked");
    }
}
public class Reflection_Java {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        TestClass t=new TestClass();

        Class cls=t.getClass();

        Constructor constructor=cls.getConstructor();

        System.out.println("Constructor name :"+constructor.getName());

        System.out.println("Public methods of classes are :");

        Method[] methods=cls.getMethods();

        for (Method m:methods){
            System.out.println(m.getName());
        }

        //calling method2()

        Method methodcall = cls.getDeclaredMethod("method2",int.class);
        methodcall.invoke(t,12);
    }
}
