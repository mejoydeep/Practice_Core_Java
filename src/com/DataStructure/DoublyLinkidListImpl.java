package com.DataStructure;

class DoublyLinkedList{
    private int data;
    private DoublyLinkedList prev;
    private DoublyLinkedList next;

    public DoublyLinkedList(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyLinkedList getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedList prev) {
        this.prev = prev;
    }

    public DoublyLinkedList getNext() {
        return next;
    }

    public void setNext(DoublyLinkedList next) {
        this.next = next;
    }
}

public class DoublyLinkidListImpl {

    DoublyLinkedList head;
    int length=0;

    public void insertAtBegining(int data){

        DoublyLinkedList node=new DoublyLinkedList(data);

            if(head==null){
                head=node;
            }
            else{
                node.setNext(head);
                node.getNext().setPrev(node);
                head=node;
            }
            length++;
    }

    public void insertAtgivenPos(int data, int position){

        DoublyLinkedList node=new DoublyLinkedList(data);

        int tempPos=position;
        DoublyLinkedList tempNode=head;

        while (tempPos-->1){
            tempNode=tempNode.getNext();
        }
        DoublyLinkedList prevNode=tempNode.getPrev();
        node.setPrev(prevNode);
        node.setNext(tempNode);
        prevNode.setNext(node);
        tempNode.setPrev(node);
        length++;
    }

    public  void insertAtEnd(int data){

        DoublyLinkedList node=new DoublyLinkedList(data);

        DoublyLinkedList temp=head;

        while (temp.getNext() !=null){
            temp=temp.getNext();
        }
        node.setPrev(temp);
        node.setNext(null);
        temp.setNext(node);
        length++;


    }

    public void deleteFromBegining(){
        DoublyLinkedList temp=head;

        head=head.getNext();

        temp=null;
    }

    public void deleteFromgivenPos(int pos){

        DoublyLinkedList temp=head;

        while (pos-->1){
            temp=temp.getNext();
        }

        temp.getPrev().setNext(temp.getNext());
        temp.getNext().setPrev(temp.getPrev());
        temp=null;
    }

    public void deleteFromEnd(){
        DoublyLinkedList temp=head;

        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.getPrev().setNext(null);
        temp=null;
    }

    public void printLinkedList(){

        DoublyLinkedList temp=head;

        while (temp !=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
    }


    public static void main(String[] args) {
          DoublyLinkidListImpl obj1=new DoublyLinkidListImpl();
          obj1.insertAtBegining(10);
          obj1.insertAtBegining(12);
          obj1.insertAtEnd(20);
          obj1.insertAtgivenPos(14,2);
          obj1.insertAtgivenPos(18,4);


          obj1.printLinkedList();

          System.out.println();

          obj1.deleteFromgivenPos(3);
          obj1.deleteFromBegining();
          obj1.deleteFromEnd();

          obj1.printLinkedList();
    }
}
