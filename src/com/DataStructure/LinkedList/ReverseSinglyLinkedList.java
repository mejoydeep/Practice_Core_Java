package com.DataStructure.LinkedList;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

public class ReverseSinglyLinkedList {
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

    //Recursive version of reverse a linked list

    public LinkedListPojo reverseRecursive(LinkedListPojo current,LinkedListPojo prev){

        if(current.getNext()==null){
            head=current;
            current.setNext(prev);
            return head;
        }
        LinkedListPojo next=current.getNext();
        current.setNext(prev);
        reverseRecursive(next,current);
        return head;
    }

    //Iterative recursion
    public LinkedListPojo iterative_reverse(){
        LinkedListPojo curr=head;
        LinkedListPojo next=null;
        LinkedListPojo prev=null;

        while(curr !=null){
            next=curr.getNext();
            curr.setNext(prev);
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseSinglyLinkedList ob1=new ReverseSinglyLinkedList();
        ob1.insertAtEnd(5);
        ob1.insertAtEnd(12);
        ob1.insertAtEnd(51);
        ob1.insertAtEnd(11);
        ob1.insertAtEnd(43);
        ob1.insertAtEnd(21);
        ob1.insertAtEnd(7);

        ob1.printLinkedList();

        //ob1.reverseRecursive(ob1.head,null);

        System.out.println();
       // ob1.printLinkedList();

        ob1.head=ob1.iterative_reverse();

        ob1.printLinkedList();




    }
}
