package com.DataStructure.LinkedList;

public class FindTheMidOfaLinkedList {

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

    //Print the linked list reverse
    public void printReverse(LinkedListPojo node){
        if (node==null){
            return;
        }
        printReverse(node.getNext());
        System.out.print(node.getData()+" ");
    }

    //check the length of the linked list even or odd
    public void checkEvenOdd(){

        LinkedListPojo temp=head;

        while (temp !=null && temp.getNext()!=null){
            temp=temp.getNext().getNext();
        }
        if (temp==null){
            System.out.println("Even numbers");
        }
        else{
            System.out.println("Odd numbers");
        }
    }


    public LinkedListPojo midOfLinkedList(){
        LinkedListPojo temp1=head;
        LinkedListPojo temp2=head;
        int i=0;

        while (temp1.getNext() !=null){
            if(i==0){
                temp1=temp1.getNext();
                i=1;
            }
            else{
                temp1=temp1.getNext();
                temp2=temp2.getNext();
                i=0;
            }
        }
        return temp2;
    }

    public static void main(String[] args) {
        FindTheMidOfaLinkedList obj=new FindTheMidOfaLinkedList();
        obj.insertAtEnd(12);
        obj.insertAtEnd(21);
        obj.insertAtEnd(14);
        obj.insertAtEnd(26);
        obj.insertAtEnd(37);
       // obj.insertAtEnd(9);



        obj.printLinkedList();
        System.out.println();
        obj.printReverse(obj.head);

        System.out.println("\nMiddle of the linked list :"+obj.midOfLinkedList().getData());

        obj.checkEvenOdd();
    }
}
