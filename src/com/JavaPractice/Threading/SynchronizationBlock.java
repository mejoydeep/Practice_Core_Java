package com.JavaPractice.Threading;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationBlock {

    String name = "";
    public int count = 0;

    public void geekName(String geek, List<String> list)
    {
        synchronized(this)
        {
            name = geek;
            count++;  // how many threads change geek's name.
        }


        list.add(geek);
    }
}

class JC{
    public static void main(String[] args) {
        SynchronizationBlock s=new SynchronizationBlock();
        List<String> list=new ArrayList<>();
        s.geekName("Joydeep",list);
        s.geekName("Bastab",list);
        System.out.println(s.name);
    }
}

