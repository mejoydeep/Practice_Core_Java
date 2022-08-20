package com.JavaPractice.generic;

import java.util.ArrayList;
import java.util.List;

public class ObjectExample {

    public static void main(String[] args) {
        //Object container

    /*    //String object
        ObjectContainer stringObject = new ObjectContainer();
        stringObject.setObject("Ross");
        System.out.println("String object :"+stringObject.getObject());
        //Integer object
        ObjectContainer intObject = new ObjectContainer();
        intObject.setObject(10);
        System.out.println("Integer object :"+intObject.getObject());

        //String Generic container
        GenericContainer<String> stringGenericContainer = new GenericContainer<String>();
        stringGenericContainer.setObject("Laura");
        System.out.println("Generic string container: "+stringGenericContainer.getObject());
        //Integer generic container
        GenericContainer<Integer> intGenericContainer = new GenericContainer<Integer>();
        intGenericContainer.setObject(10);
        System.out.println("Generic integer container: "+intGenericContainer.getObject());*/

        // List with object container
        ObjectContainer obj = new ObjectContainer();
        obj.setObject("Joy");
        System.out.println(obj.getObject());
        obj.setObject(11);
        System.out.println(obj.getObject());

        List objList = new ArrayList();
        objList.add(obj);
        int objValue = (int)((ObjectContainer)objList.get(0)).getObject();
        System.out.println(objValue);

        //List with generic container
        List<GenericContainer> genList = new ArrayList();
        GenericContainer<Integer> genContainer = new GenericContainer<>();
        genContainer.setObject(12);
        genList.add(genContainer);
        GenericContainer<Integer> object = genList.get(0);
        System.out.println(object.getObject());
        //Generics with constructors
        GenericContainer g1 = new GenericContainer(10);
        GenericContainer g2 = new GenericContainer("Love");
        System.out.println(g1.getObject());
        System.out.println(g2.getObject());

    }
}
