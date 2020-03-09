package com.OOPS;

/**
 * Created by JC52036 on 15-01-2020.
 */
public class Test03 implements Cloneable {

    int emp_id;
    String emp_name;

    @Override
    public String toString() {
        return "Test03{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                '}';
    }

    // default constructor
    Test03(String emp_name, int emp_id)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class Test{
    public static void main(String[] args) throws CloneNotSupportedException {
        Test03 t=new Test03("Joydeep",1);
        Test03 t2=(Test03) t.clone();
        System.out.println(t.toString());
        System.out.println(t2.toString());
    }
}
