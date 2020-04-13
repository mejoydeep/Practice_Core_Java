package com.DataStructure.LinkedList;

public class SplitCircuarLinkeListInto2 {

    public LinkedListPojo tail,head1,head2;
    public int length;

    public void insertAtBegininhg(int data){
        LinkedListPojo temp=new LinkedListPojo(data);

        if (tail !=null){
            temp.setNext(tail.getNext());
            tail.setNext(temp);
        }
        else{
            tail=temp;
            tail.setNext(tail);
        }
        length++;
    }

    public  void insertAtTheEnd(int data){
        insertAtBegininhg(data);
        tail=tail.getNext();
    }

    public void splitFunction(){

        LinkedListPojo slow=tail.getNext();
        LinkedListPojo fast=tail.getNext();

        if (tail==null){
            return;
        }

        while (fast !=tail && fast.getNext()!=tail){
            fast=fast.getNext().getNext();
            slow=slow.getNext();
        }

        if (fast.getNext()==tail){
            fast=fast.getNext();
        }

        head1=tail.getNext();
        head2=slow.getNext();

        slow.setNext(tail.getNext());
        tail.setNext(head2);

    }

    public void printLists(LinkedListPojo head){

        LinkedListPojo temp=head;

        System.out.print(temp.getData() +" ");
        temp=temp.getNext();

        while (temp !=head){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {
        SplitCircuarLinkeListInto2 obj1=new SplitCircuarLinkeListInto2();
        obj1.insertAtTheEnd(12);
        obj1.insertAtTheEnd(13);
        obj1.insertAtTheEnd(14);
        obj1.insertAtTheEnd(6);
        obj1.insertAtTheEnd(76);

        System.out.print("Entire List :\t");
        obj1.printLists(obj1.tail.getNext());
        System.out.println("\n");

        obj1.splitFunction();

        System.out.print("First half :\t");
        obj1.printLists(obj1.head1);
        System.out.println("\n");

        System.out.print("Second half :\t");
        obj1.printLists(obj1.head2);
    }


}
