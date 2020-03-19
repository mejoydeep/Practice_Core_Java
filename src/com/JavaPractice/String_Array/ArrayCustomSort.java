package com.JavaPractice.String_Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by JC52036 on 18-03-2020.
 */
class Student{
    int roll_no;
    String name;

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }
}

class SortByRoll implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.roll_no-o2.roll_no;
    }
}
public class ArrayCustomSort {
    public static void main(String[] args) {
        Student[] arr={new Student(13,"Joy"),
                        new Student(12,"Rohit"),
                        new Student(1,"Rishoi"),
                        new Student(10,"Pri")};


        for (Student s:
                arr ) {
            System.out.println(s);
        }

        System.out.println();
        Arrays.sort(arr,1,4,new SortByRoll());

        for (Student s:
            arr ) {
            System.out.println(s);
        }

    }
}
