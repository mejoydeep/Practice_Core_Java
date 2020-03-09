package com.JavaPractice;

/**
 * Created by JC52036 on 07-02-2020.
 */
public class Exception03 {
    static void fun() throws NullPointerException{

            throw new NullPointerException();

       /* catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }*/
    }

    public static void main(String[] args) {
        fun();
    }

}
