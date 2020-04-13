package com.DataStructure.LinkedList;

public class CheckPallindrome {

    LinkedListPojo head;
    LinkedListPojo slow, fast, seconed_half, left;

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

    public boolean isPallindrome(){
        fast=head;
        slow=head;
        LinkedListPojo prev_slow=head;
        LinkedListPojo mid= null;
        boolean res=true;

        if (head !=null || head.getNext() !=null){

            while (fast !=null && fast.getNext() !=null){
                fast=fast.getNext().getNext();
                prev_slow=slow;
                slow=slow.getNext();
            }

            if (fast !=null){
                mid=slow;
                slow=slow.getNext();
            }

            prev_slow.setNext(null);
            seconed_half=slow;

            reverseFunction();

            res=compare2halfs(head,seconed_half);

            reverseFunction();

            if (mid !=null){
                prev_slow.setNext(mid);
                mid.setNext(seconed_half);
            }
            else {
                prev_slow.setNext(seconed_half);
            }
        }
            return res;

    }

    public void reverseFunction(){

        LinkedListPojo next;
        LinkedListPojo prev=null;
        LinkedListPojo current=seconed_half;

        while (current !=null){
            next=current.getNext();
            current.setNext(prev);
            prev=current;
            current=next;
        }
        seconed_half=prev;
    }

    public boolean compare2halfs(LinkedListPojo n1,LinkedListPojo n2){
        LinkedListPojo temp1=n1;
        LinkedListPojo temp2=n2;

        while (temp1 !=null && temp2 !=null){
            if (temp1.getData()==temp2.getData()){
                temp1=temp1.getNext();
                temp2=temp2.getNext();
            }
            else{
                return false;
            }
        }

        if (temp1==null && temp2==null){
            return true;
        }
        else return false;

    }


    // recursive palindrome check

    public boolean isRecursive_recursive(LinkedListPojo right){

        left=head;

        if (right==null){
            return true;
        }

        boolean isp=isRecursive_recursive(right.getNext());

        if (isp==false){
            return false;
        }

        boolean isp1= right.getData()==left.getData();

        left=left.getNext();

        return isp1;
    }

    public static void main(String[] args) {
        CheckPallindrome obj=new CheckPallindrome();
        obj.insertAtEnd(1);
        obj.insertAtEnd(2);
        obj.insertAtEnd(3);
        obj.insertAtEnd(2);
        obj.insertAtEnd(1);

        obj.printLinkedList();
        System.out.println();

        System.out.println("Is Pallindrom : "+obj.isPallindrome());

        System.out.println();
        obj.printLinkedList();

        System.out.println("\nIs Palindrome recursive :"+obj.isRecursive_recursive(obj.head));
    }
}
