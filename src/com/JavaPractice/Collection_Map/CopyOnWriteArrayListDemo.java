package com.JavaPractice.Collection_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by JC52036 on 12-03-2020.
 */
public class CopyOnWriteArrayListDemo extends Thread {

   static CopyOnWriteArrayList list=new CopyOnWriteArrayList();

    public void run(){
        list.add("d");
    }
    public static void main(String[] args) throws InterruptedException {
        list.add("a");
        list.add("b");
        list.add("c");

        CopyOnWriteArrayListDemo listDemo=new CopyOnWriteArrayListDemo();
        listDemo.run();

        Thread.sleep(1000);

        Iterator it=list.iterator();
        while (it.hasNext()){
            String s=(String) it.next();
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(list);
    }



}
