package com.DataStructure.LinkedList;

public class FloyedCircleFindingAlgo {

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

    //Find if the Linked-list contains any list
    public boolean findCircleInLinkedList(){

        LinkedListPojo slow=head;
        LinkedListPojo fast=head;

        while (fast !=null && fast.getNext() !=null){
            fast=fast.getNext().getNext();
            slow=slow.getNext();

            if(slow==fast){
                return true;
            }
        }
        return false;

    }

    //If the list contains any loop find the starting point of the loop

    public LinkedListPojo loopStarting(){
        LinkedListPojo slow=head;
        LinkedListPojo fast=head;
        boolean findLoop=false;

        while (fast !=null && fast.getNext() !=null){
            fast=fast.getNext().getNext();
            slow=slow.getNext();

            if(slow==fast){
                findLoop = true;
                break;
            }
        }

        if (findLoop){
            slow=head;
            while (slow !=fast){
                fast=fast.getNext();
                slow=slow.getNext();
            }
            return fast;
        }else{
            return null;
        }
    }

    public int lengthofTheloop(){
        LinkedListPojo slow=head;
        LinkedListPojo fast=head;
        boolean findLoop=false;
        int length=0;

        while (fast !=null && fast.getNext() !=null){
            fast=fast.getNext().getNext();
            slow=slow.getNext();

            if(slow==fast){
                findLoop = true;
                break;
            }
        }
        if(findLoop){
            do {
                slow=slow.getNext();
                length++;
            }
            while (slow!=fast);

        }
        return length;

    }


    public void printLinkedList(){
        LinkedListPojo temp=head;

        while(temp !=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {
        FloyedCircleFindingAlgo ob1=new FloyedCircleFindingAlgo();
        ob1.insertAtEnd(5);
        ob1.insertAtEnd(12);
        ob1.insertAtEnd(51);
        ob1.insertAtEnd(11);
        ob1.insertAtEnd(43);
        ob1.insertAtEnd(21);
        ob1.insertAtEnd(7);

        ob1.printLinkedList();

        LinkedListPojo temp= ob1.head.getNext().getNext().getNext().getNext().getNext().getNext();

        temp.setNext(ob1.head.getNext().getNext());

        System.out.println("\nDetect loop :"+ob1.findCircleInLinkedList());

        System.out.println("\nStarting point of the loop :"+ob1.loopStarting().getData());

        System.out.println("Length of the loop :"+ob1.lengthofTheloop());


    }
}
