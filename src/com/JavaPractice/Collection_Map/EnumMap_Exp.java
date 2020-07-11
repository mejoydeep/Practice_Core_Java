package com.JavaPractice.Collection_Map;

import com.sun.deploy.util.SyncAccess;

import java.util.EnumMap;

public class EnumMap_Exp {
    enum EnumDemo{
        Coding, Writing, Reading, Listening ;
    }

    public static void main(String[] args) {
        EnumMap<EnumDemo,String> enumMap = new EnumMap<EnumDemo, String>(EnumDemo.class);
        enumMap.put(EnumDemo.Coding,"Coding is love");
        enumMap.put(EnumDemo.Listening,"Listening is power");
        enumMap.put(EnumDemo.Reading,"Reading is important");
        enumMap.put(EnumDemo.Writing,"Writing is a skill");

        System.out.println("Enum Map size: "+enumMap.size()+"\nEnum Map" +enumMap);

        //Getting value of a particular enum
        System.out.println("Key :"+EnumDemo.Coding +" Value :"+enumMap.get(EnumDemo.Coding));

        //Contains Key and value check
        System.out.println("Contains Key check:"+"Key :"+EnumDemo.Coding+" value: "+enumMap.containsKey(EnumDemo.Coding)+
                           "\nContains Value check:"+enumMap.containsValue("Reading is important"));


        //Creating Enum from Enum type
        EnumMap<EnumDemo,String> enumMap1 = new EnumMap<EnumDemo, String>(enumMap);

        System.out.println("Printing the EnumMap from EnumMap constructor:"+enumMap1);
    }

}
