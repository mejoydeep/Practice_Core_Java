package com.JavaPractice.Collection_Map;

import java.util.EnumSet;

enum Types {

    Developer, Tester, BA, Manager;
};

public class EnumSet_Impl {

    public static void main(String[] args) {

        EnumSet<Types> eSet1, eSet2, eSet3, eSet4;

        eSet1 = EnumSet.of(Types.Developer, Types.Tester);
        eSet2 = EnumSet.complementOf(eSet1);
        eSet3 = EnumSet.allOf(Types.class);
        eSet4 = EnumSet.of(Types.BA);

        EnumSet<Types> eSet5 = EnumSet.of(Types.Manager);


        System.out.println(" First Enum Set :" + eSet1);
        System.out.println(" Second Enum Set :" + eSet2);
        System.out.println(" Third Enum Set :" + eSet3);
        System.out.println(" Fourth Enum Set :" + eSet4);
        System.out.println(" Fifth Enum Set :" + eSet5);


    }
}
