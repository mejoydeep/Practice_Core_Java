package com.JavaPractice;

import java.io.*;

class Check implements Serializable {
    public static int roll;
    int age;
    String name;
    transient String address;

    public Check(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }
}

public class SerializationDemo {

    public static void printData(Check obj1){
        System.out.println("Address :"+obj1.address);
        System.out.println("name "+obj1.name);
        System.out.println("Age "+obj1.age);
        System.out.println("Roll "+Check.roll);


    }

    public static void main(String[] args) {

        Check c1=new Check(12,"Tony","marvel");

        String filename="/home/joyd/Desktop/Joy/Hi.txt";

        try {
            FileOutputStream fout=new FileOutputStream(filename);
            ObjectOutputStream out=new ObjectOutputStream(fout);

            out.writeObject(c1);

            out.close();
            fout.close();

            System.out.println("Object has been serializes");

            Check.roll=10;

            printData(c1);

            Check.roll=20;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        c1=null;

        try {
            FileInputStream fin=new FileInputStream(filename);
            ObjectInputStream oin=new ObjectInputStream(fin);

            c1=(Check) oin.readObject();
            oin.close();
            fin.close();

            System.out.println("Object has been de-serialized");
            printData(c1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
