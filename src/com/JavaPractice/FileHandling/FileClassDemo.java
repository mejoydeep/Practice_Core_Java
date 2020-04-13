package com.JavaPractice.FileHandling;

import java.io.File;
import java.util.Scanner;

public class FileClassDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String name= sc.next();

        File f=new File(name);

        System.out.println("File name : "+f.getName());
        System.out.println("Path : "+f.getPath()+"\nParent : "+f.getParent()+"\nAbsolute Path : "+f.getAbsolutePath()
                           +"\nExists : "+f.exists());
    }
}
