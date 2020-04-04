package com.DataStructure.LinkedList;

/**
 * Created by JC52036 on 20-01-2020.
 */
public class LinkedList3 {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }

    }
    void deleteList(){
        head=null;
    }

    //insert a node at the begining
    public void insert_at_begining(int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
    }

    public void print_the_linkedList(){
        if(head==null){
            System.out.println("Link list empty");
        }
        else{
            Node node=head;
            while(node!=null){
                System.out.print(node.data+", ");
                node=node.next;
            }
            System.out.println();

        }
    }

    //Count the link list in an recursive way
    public int getCountRec(Node node){
        if(node==null){
            return 0;
        }
        return 1+getCountRec(node.next);
    }
    //Count the no of elements in a linked list
    public int getCount(){
        return getCountRec(head);
    }

    //Search a element in the linked list by key
    public boolean searchElement(int data){
        Node temp=head;
        return searchElementRec(temp,data);
    }
    //Search a element in the linked list by key by recursion
    public boolean searchElementRec(Node node,int data){
        if(node==null){
            return false;
        }
        if(node.data==data){
            return true;
        }
        return searchElementRec(node.next,data);
    }

    //N'th node from the end
    public void nthNodeFromtheEnd(int n){
        Node temp=head;
        Node main=head;
        int count=0;
        if(head!=null){
            while (count<n){
                if(temp==null){
                    System.out.println("n is greater than the length of the node");
                    return;
                }
                temp=temp.next;
                count++;
            }
            while (temp!=null){
                temp=temp.next;
                main=main.next;
            }
            System.out.println("N-th node from the ed is: "+main.data);
        }
    }

    //Count the occurance of no of elements in the list
    public int getCount(int element){
        Node node=head;
       return getCount_by_recursion(node, element);
    }
    //Using recursion find the occurance of a element in the list
    public int getCount_by_recursion(Node node, int element){
        if(node==null){
            return 0;
        }
        if(node.data==element){
            return 1+getCount_by_recursion(node.next,element);
        }
        return getCount_by_recursion(node.next,element);
    }
    public static void main(String[] args) {
        LinkedList3 linkList=new LinkedList3();
        linkList.insert_at_begining(34);
        linkList.insert_at_begining(43);
        linkList.insert_at_begining(56);
        linkList.insert_at_begining(64);
        linkList.insert_at_begining(12);
        linkList.insert_at_begining(34);
        linkList.print_the_linkedList();

        //Delete the linked list
       /* linkList.deleteList();
        linkList.print_the_linkedList();*/

        System.out.println("Count of the node in the linked list: "+linkList.getCount());
        System.out.println("Found an element in the linked list: : "+linkList.searchElement(32));
        System.out.println("Found an element in the linked list: : "+linkList.searchElement(56));

        //n-th node from the  end
        linkList.nthNodeFromtheEnd(7);

        System.out.println("Count of a element: "+linkList.getCount(0));

    }

}
