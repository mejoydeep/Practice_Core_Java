package com.OOPS;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by JC52036 on 15-01-2020.
 */
 class Test02 {
    @Override
    public String toString() {
        return "Test02{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

    public Test02(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ConstructorExample{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor c=Test02.class.getConstructor(String.class);
        Test02 t=(Test02) c.newInstance("Joy");
        t.toString();
        System.out.println(t.toString());
        System.out.println(t.getName());
    }
}
