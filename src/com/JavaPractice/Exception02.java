package com.JavaPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JC52036 on 06-02-2020.
 */
public class Exception02 {

    public static void main(String[] args)  {
        try {
            List<String> list=new ArrayList<>();
            list.add("Joy");
            list.add("Sai");
            //System.out.println(list.get(2));
            String ak="Ajk";
            //int i=Integer.parseInt(ak);
            //System.out.println(i);
            String str=null;
            System.out.println(str.charAt(0));

        }
       /* catch (IndexOutOfBoundsException e){
            e.printStackTrace();
          //  System.out.println(e.toString());
            System.out.println(e.getMessage());
        }*/
        /*catch(Exception e){

        }*/
        catch(NumberFormatException e){
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Inside finally block");
        }

    }
}
