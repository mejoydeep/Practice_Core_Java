package com.DataStructure.LinkedList;

public class NthNodeFromTheEnd {

    LinkedListPojo head;

    private static int recursionCounter=0;
    private static int recurssionValue;

    public void insertAtBegining(int data){

        LinkedListPojo temp=new LinkedListPojo(data);
        if(head==null){
            head=temp;
        }
        else{
            temp.setNext(head);
            head=temp;
        }
    }


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

    //NthNodeFromTheEnd
    public int NthNodeFromTheEnd(int n){

        LinkedListPojo slowNode=null;
        LinkedListPojo fastNode=head;

        for (int i=1;i<n;i++){
            if(fastNode !=null){
                fastNode=fastNode.getNext();
            }
        }
        while (fastNode!=null){
            fastNode=fastNode.getNext();

            if (slowNode !=null) {
                slowNode = slowNode.getNext();
            }
            else{
                slowNode=head;
            }
        }
        if(slowNode==null){
            return Integer.MIN_VALUE;
        }
        return slowNode.getData();
    }

    //Nth node from end recursion
    public LinkedListPojo NthNodeFromLastRecursion(LinkedListPojo node, int k){
        if(node != null){
            NthNodeFromLastRecursion(node.getNext(), k);
            recursionCounter++;
            if(recursionCounter==k){
                recurssionValue= node.getData();
            }
        }
        return null;
    }

    public void printLinkedList(){
        LinkedListPojo temp=head;

        while(temp !=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {
        NthNodeFromTheEnd obj=new NthNodeFromTheEnd();
        obj.insertAtEnd(10);
        obj.insertAtEnd(5);
        obj.insertAtEnd(15);
        obj.insertAtBegining(3);
        obj.insertAtEnd(24);
        obj.printLinkedList();

        System.out.println("\n Nth node from the end :"+obj.NthNodeFromTheEnd(2));

        obj.NthNodeFromLastRecursion(obj.head,2);
        System.out.println("\n Nth node from the end from recursion :"+recurssionValue);
    }

}
