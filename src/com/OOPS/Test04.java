package com.OOPS;

/**
 * Created by JC52036 on 15-01-2020.
 */
public class Test04 {
    public int emp_id;
    public String emp_name;

    // Default constructor
    public Test04(int emp_id, String emp_name)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }
}
class  Fio{
    public static void main(String[] args) {
        Test04 t=new Test04(1,"fgh");
    }
}
