package com.DataStructure.LinkedList;

import java.util.HashSet;

public class RemoveDuplicateFromUnsortedLinkedList {

    LinkedListPojo head;

    public void insertAtEnd(int data){

        LinkedListPojo temp=new LinkedListPojo(data);
        if (head==null){
            head=temp;
            return;
        }
        LinkedListPojo pointer=head;
        while (pointer.getNext() !=null){
            pointer=pointer.getNext();
        }
        pointer.setNext(temp);
    }

    public void printLinkedList(){
        LinkedListPojo temp=head;

        while(temp !=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
    }


    public void removeDuplicate(){

        LinkedListPojo current=head;

        while (current !=null){

            LinkedListPojo temp=current;
            LinkedListPojo prev=current;

            while (temp !=null){
                if (temp.getData()==current.getData()){
                    if (temp.getNext()==null){
                        prev.setNext(null);
                    }
                    temp=temp.getNext();
                }
                else {
                    prev.setNext(temp);
                    prev=temp;
                    temp=temp.getNext();
                }
            }
            current=current.getNext();
        }
    }

    //remove duplicate using Hashset
    public void removeDuplicateUsingHashSet(){

        LinkedListPojo temp=head;
        LinkedListPojo prev=null;

        while (temp !=null){

            HashSet<Integer> set=new HashSet<>();

            if (set.contains(temp.getData())){
                prev.setNext(temp.getNext());

            }
            else {
                set.add(temp.getData());
                prev=temp;
            }
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {
        RemoveDuplicateFromUnsortedLinkedList obj=new RemoveDuplicateFromUnsortedLinkedList();
        obj.insertAtEnd(17);
        obj.insertAtEnd(10);
        obj.insertAtEnd(10);
        obj.insertAtEnd(12);
        obj.insertAtEnd(12);
        obj.insertAtEnd(10);
        obj.insertAtEnd(12);
        obj.insertAtEnd(10);
        obj.insertAtEnd(15);

        obj.printLinkedList();

        obj.removeDuplicate();

/*
        System.out.println("\nAfter removing duplicate");
        obj.printLinkedList();*/

        System.out.println("\nAfter removing duplicate via recursion");
        obj.removeDuplicateUsingHashSet();
        obj.printLinkedList();

    }
}
