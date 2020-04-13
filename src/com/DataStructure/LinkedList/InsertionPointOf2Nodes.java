package com.DataStructure.LinkedList;

public class InsertionPointOf2Nodes {

    //intersectionOf2Nodes
    public LinkedListPojo insertionOfNodes(LinkedListPojo l1, LinkedListPojo l2){

        LinkedListPojo head1=l1;
        LinkedListPojo head2=l2;
        LinkedListPojo result=null;
        int length1=0;
        int length2=0;
        int diff=0;

        while (head1!=null){
            length1++;
            head1=head1.getNext();
        }
        while (head2 !=null){
            length2++;
            head2=head2.getNext();
        }

        if(length1>length2){
            diff=length1-length2;
            result=intersectionPoint(diff,l1,l2);
        }
        else{
            diff=length2-length1;
            result=intersectionPoint(diff,l2,l1);
        }

       return result;
    }

    public LinkedListPojo intersectionPoint(int d, LinkedListPojo l1,LinkedListPojo l2){
        LinkedListPojo temp1=l1;
        LinkedListPojo temp2=l2;

        for (int i=0;i<d;i++){
            if (temp1==null){
                return null;
            }
            temp1=temp1.getNext();
        }

        while (temp1 !=null && temp2 !=null){
            if (temp1==temp2){
                return temp1;
            }
            temp1=temp1.getNext();
            temp2=temp2.getNext();
        }
        return null;
    }

    public static void main(String[] args) {

        LinkedListPojo l1=new LinkedListPojo(12);
        l1.setNext(new LinkedListPojo(5));
        l1.getNext().setNext(new LinkedListPojo(7));
        l1.getNext().getNext().setNext(new LinkedListPojo(4));

        LinkedListPojo l2=new LinkedListPojo(3);
        l2.setNext(l1.getNext().getNext());

        InsertionPointOf2Nodes obj=new InsertionPointOf2Nodes();

        System.out.println(obj.insertionOfNodes(l1,l2).getData());

    }
}
