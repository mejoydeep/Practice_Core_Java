package com.OOPS;

/**
 * Created by JC52036 on 15-01-2020.
 */
public class Test01 {

    void message()
    {
        System.out.println("Hello Geeks !!");
    }
}

class Forname {
    public static void main(String args[]) {
        try {
            Class c = Class.forName("com.OOPS.Test01");
            Test01 s = (Test01) c.newInstance();
            s.message();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
