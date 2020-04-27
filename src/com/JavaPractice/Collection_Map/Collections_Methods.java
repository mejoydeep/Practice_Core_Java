package com.JavaPractice.Collection_Map;


import java.util.*;
import java.util.AbstractCollection;

/**
 * Created by JC52036 on 20-02-2020.
 */
public class Collections_Methods {
    public static void main(String[] args) {
       // List<String> st=new <String>();
        AbstractCollection<String> as1=new ArrayList<>();
        as1.add("Tets");
        as1.add("Mood");
        as1.add("Testing");
        System.out.println(as1);


        //disjoint() method in collection
        
        List<String>  mylist1 = new ArrayList<String>();
        mylist1.add("practice");
        mylist1.add("code");
        mylist1.add("quiz");
        mylist1.add("geeksforgeeks");

        List<String>  mylist2 = new Vector<String>();
        mylist2.add("geeks");
        mylist2.add("geek");
        mylist2.add("for");
        mylist2.add("coder");

        List mylist3 = new Vector();
        mylist3.add("coder");

        Set<String>  mylist4 = new HashSet<String>();
        mylist4.add("practice");
        mylist4.add("code");
        mylist4.add("quiz");
        mylist4.add("geeksforgeeks");

        List<Integer> myList5=new ArrayList<Integer>();
        myList5.add(10);
        myList5.add(20);

        List<Double> myList6=new ArrayList<Double>();
        myList6.add(10.0);
        myList6.add(30.0);

        Integer[] ar1={1,4,5};
        Integer[] ar2={1,6,7};

        System.out.println("myList1 and myList2 :"+Collections.disjoint(mylist1,mylist2));
        System.out.println("myList2 and myList3 :"+Collections.disjoint(mylist1,mylist3));
        System.out.println("myList1 and myList4 :"+Collections.disjoint(mylist1,mylist4));
        System.out.println("myList5 and myList6 :"+Collections.disjoint(myList5,myList6));// type should also be matched
        System.out.println("Array disjoint method :"+Collections.disjoint(Arrays.asList(as1),Arrays.asList(ar2)));



        System.out.println();
        // frequency() method in collection

        List<String>  mylist7 = new ArrayList<String>();
        mylist7.add("practice");
        mylist7.add("code");
        mylist7.add("code");
        mylist7.add("quiz");
        mylist7.add("geeksforgeeks");

        System.out.println("Frequency of some element in collection :"+Collections.frequency(mylist7,"Code")); // Case should also be matched

        Integer[] ar3={10,30,40,30};
        System.out.println("Frequency of some element in array :"+Collections.frequency(Arrays.asList(ar3),30));


        System.out.println();
        //rotate() method in collection

        List<String> mylist8=new ArrayList<>();
        mylist8.add("practice");
        mylist8.add("code");
        mylist8.add("coder");
        mylist8.add("quiz");
        mylist8.add("geeksforgeeks");
        Collections.rotate(mylist8,2);

        System.out.println(mylist8);

        Integer[] ar4={10,20,30,40,50};
        Collections.rotate(Arrays.asList(ar4),3);
        System.out.println(Arrays.toString(ar4));

        System.out.println();

        //singleton method
        Integer[] string={1,2,3,1,2,4,5,6,4,8};
        List list=new ArrayList<>(Arrays.asList(string));
        list.removeAll(Collections.singleton(1));
        System.out.println(list);

        System.out.println();

        //reverseOrder() method

        List<Integer> mylist9=new ArrayList<>();
        mylist9.add(10);
        mylist9.add(50);
        mylist9.add(40);
        System.out.println("Before reverse order :"+mylist9);

        Collections.sort(mylist9,Collections.reverseOrder());
        System.out.println("After reverse order"+mylist9);

        Integer[] arr={20,30,21,10};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        //Shuffle methods
        System.out.println();

        List<String> myList10=new ArrayList<String>(Arrays.asList("Joy","Toy","Boy","Roy"));

        System.out.println("Before shuffle : "+myList10);

       // Collections.shuffle(myList10);
        Collections.shuffle(myList10,new Random());

        System.out.println("After shuffle : "+myList10);

        //Swapping elements of the list
        System.out.println();

        List<String> myList11=new ArrayList<>(myList10);

        System.out.println("Before swapping :"+myList11);

        Collections.swap(myList11,1,3);
        System.out.println("After swapping :"+myList11);








    }
}
