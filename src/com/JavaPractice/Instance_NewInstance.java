package com.JavaPractice;

public class Instance_NewInstance {

    public boolean checkinstance(Object obj, String s) throws ClassNotFoundException {
        return Class.forName(s).isInstance(obj);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //isInstance() and instanceof operator usage

        Integer i=new Integer(5);
        Instance_NewInstance ob=new Instance_NewInstance();
        boolean b1=ob.checkinstance(i,"java.lang.Integer");
        boolean b2=ob.checkinstance(i,"java.lang.String");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(i instanceof  Integer);


        //newInstance() operator usage
        Object obj=Class.forName("com.JavaPractice.Instance_NewInstance").newInstance();
        System.out.println("New instance type :"+obj.getClass().getName());
    }
}
