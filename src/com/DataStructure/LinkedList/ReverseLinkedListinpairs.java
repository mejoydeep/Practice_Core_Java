package com.DataStructure.LinkedList;

public class ReverseLinkedListinpairs {

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

    //reverseLinkedList in pairs
    public  LinkedListPojo reverseLinkedList_Recursive(LinkedListPojo head){

        LinkedListPojo temp;
        if (head==null || head.getNext()==null){
            return head;
        }
      else{
            temp=head.getNext();
            head.setNext(temp.getNext());
            temp.setNext(head);
            head=temp;
            LinkedListPojo next=head.getNext().getNext();
            next=reverseLinkedList_Recursive(head.getNext().getNext());
        }
       return  head;
    }

    public static void main(String[] args) {
        ReverseLinkedListinpairs obj=new ReverseLinkedListinpairs();
        obj.insertAtEnd(12);
        obj.insertAtEnd(21);
        obj.insertAtEnd(43);
        obj.insertAtEnd(98);
        obj.insertAtEnd(32);
        obj.printLinkedList();

        System.out.println();
        obj.head=obj.reverseLinkedList_Recursive(obj.head);
        obj.printLinkedList();
    }


}
