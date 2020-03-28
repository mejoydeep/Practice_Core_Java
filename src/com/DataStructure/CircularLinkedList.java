package com.DataStructure;

class LinkedList{
    private int data;
    private LinkedList next;

    public LinkedList(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }
}

public class CircularLinkedList {
    public LinkedList tail;
    public int length;

    public void insertAtBegininhg(int data){
        LinkedList temp=new LinkedList(data);

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

    public void removeFromBegining(){
        LinkedList temp=tail.getNext();
        if(tail==tail.getNext()){
            tail=null;
        }
        else{
            tail.setNext(temp.getNext());
            temp.setNext(null);
        }
        length--;

    }

    public void removeFromEnd(){

        LinkedList finger=tail;
        while (finger.getNext() !=tail){
           finger=finger.getNext();
        }
        if(finger==tail){
            tail=null;
        }
        else{
            finger.setNext(tail.getNext());
            tail=finger;
        }
        length--;

    }

    public void printList(){

        if (tail.getNext()==tail){
            System.out.println(tail.getData());
        }
        else {
            LinkedList temp=tail.getNext();
            while (temp!=tail){
                System.out.print(temp.getData() +" ");
                temp=temp.getNext();
            }
            System.out.print(temp.getData());
        }
    }

    public static void main(String[] args) {
        CircularLinkedList obj=new CircularLinkedList();
        obj.insertAtBegininhg(10);
        obj.insertAtBegininhg(20);
        obj.insertAtBegininhg(30);
        obj.insertAtTheEnd(5);

        obj.printList();
        System.out.println();

        obj.removeFromBegining();
        obj.printList();
        System.out.println();

        obj.removeFromEnd();
        obj.printList();
    }

}
