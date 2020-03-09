package com.JavaPractice;

/**
 * Created by JC52036 on 04-03-2020.
 */
class MySingletonClass {
    static MySingletonClass mySingletonClass=null;
    public int x=10;

    private MySingletonClass(){
         x=x+10;
    }
    static public MySingletonClass getInstancess(){
        if(mySingletonClass==null){
            mySingletonClass=new MySingletonClass();
        }
        return mySingletonClass;
    }
}

class MainClas{
    public static void main(String[] args) {
        MySingletonClass c1=MySingletonClass.getInstancess();
        MySingletonClass c2=MySingletonClass.getInstancess();
        c1.x=c1.x+10;
        System.out.println("Value of c1.x= "+c1.x);
        System.out.println("Value of c2.x= "+c2.x); // c2.x value chages because both refer to the same class
    }
        }
