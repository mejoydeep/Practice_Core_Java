package com.DataStructure.LinkedList;


class LinkedListPojo{

    private int data;
    private LinkedListPojo next;

    public LinkedListPojo(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListPojo getNext() {
        return next;
    }

    public void setNext(LinkedListPojo next) {
        this.next = next;
    }
}
