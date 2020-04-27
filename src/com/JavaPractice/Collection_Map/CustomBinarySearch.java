package com.JavaPractice.Collection_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Website{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Website(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class CustomBinarySearch {
    public static void main(String[] args) {
        List<Website> list=new ArrayList<Website>();
        list.add(new Website(1,"Google"));
        list.add(new Website(1,"Alphabet"));

        list.add(new Website(2,"Netflix"));
        list.add(new Website(3,"Zoom"));
        list.add(new Website(4,"Sap"));
        list.add(new Website(5,"Zoom"));

        Comparator<Website> c=new Comparator<Website>() {
            @Override
            public int compare(Website o1, Website o2) {
                int idCompare = o1.id-o2.id;
                int nameCompare=o1.name.compareTo(o2.name);

                if (idCompare==0){
                    return nameCompare;
                }
                else{
                    return idCompare;
                }
            }
        };

        Collections.sort(list,c);
        for (Website w: list){
            System.out.println(w.getId() +" : "+w.getName());

        }
        int index= Collections.binarySearch(list,new Website(1,"ABC"),c);
        System.out.println(" Index :"+index);


    }

}
