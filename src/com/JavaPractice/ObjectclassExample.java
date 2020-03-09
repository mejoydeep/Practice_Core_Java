package com.JavaPractice;

/**
 * Created by JC52036 on 12-02-2020.
 */
public class ObjectclassExample {
    static int last_roll=96;
    int rol_no;

    ObjectclassExample(){
        rol_no=last_roll;
        last_roll++;
    }

    @Override
    public int hashCode() {
       // return super.hashCode();
        return rol_no;
    }

    @Override
    public String toString() {
        return "ObjectclassExample{" +
                "rol_no=" + rol_no +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Inside finalize method");
    }

    public static void main(String[] args) {
        ObjectclassExample ob=new ObjectclassExample();
        System.out.println(ob);
        System.out.println(ob.toString());

        //Garbage Collection
        ObjectclassExample ob2 =new ObjectclassExample();
        ob=null;
        System.gc();
        ob2=null;
        Runtime.getRuntime().gc();
    }
}
