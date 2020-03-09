package com.JavaPractice.Collection_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by JC52036 on 25-02-2020.
 */
public class Collection2CustomDataTypeComparison {

    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(101,"Joy","Kolkata"));
        list.add(new Student(111,"Indu","Kalyani"));
        list.add(new Student(121,"Mandy","Bangalore"));
        list.add(new Student(115,"Aishee","naihati"));

        System.out.println("Unsorted");
        for (Student s:list){
            System.out.println(s);
        }

        //For ascending order sort
        Collections.sort(list,new SortByRoll());

        System.out.println("Ascending Sorted");
        for (Student s:list){
            System.out.println(s);
        }

        //For reverse order sort
        Comparator c=Collections.reverseOrder(new SortByRoll());
        Collections.sort(list,c);
        System.out.println("Reverse Sorted");
        for (Student s:list){
            System.out.println(s);
        }
    }

}

class Student{
    int Roll_No;
    String Name;
    String Address;

    public Student(int roll_No, String name, String address) {
        Roll_No = roll_No;
        Name = name;
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll_No=" + Roll_No +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}

class SortByRoll implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.Name.charAt(0)-o2.Name.charAt(0);
    }
}
