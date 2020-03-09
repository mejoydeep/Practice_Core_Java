package com.JavaPractice;

/**
 * Created by JC52036 on 07-02-2020.
 */
public class Exception4_Userdefined extends Exception {
   /* public Exception4_Userdefined(String s){
        super(s);
    }*/
}

class CheckException{
    public static void main(String[] args) {
        try {
            throw new Exception4_Userdefined();
        }
        catch (Exception4_Userdefined e){
            System.out.println("Catched");
            System.out.println(e.getMessage());
        }
    }
}
