package com.DataStructure.Tree;

public class DLL_To_BST {

    static Llist head;

    public static void main(String[] args) {

        DLL_To_BST obj = new DLL_To_BST();

        for (int i = 3; i >= 1; i--) {
            obj.insertintoLList(i);
        }
        System.out.println("Printing the LinkedList");
        obj.printLL();
        System.out.println();

        int length = obj.countNodes();

        BST node = obj.convertToBST(head, 0, length - 1);

        System.out.println("Print the BST pre-order traversal");
        obj.preOrderBST(node);
    }

    //Convert LL to BST
    public BST convertToBST(Llist head, int start, int end) {

        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;

        BST left = convertToBST(head, start, mid - 1);
        BST root = new BST(head.data);

        root.left = left;

        if (head.next != null) {
            head.data = head.next.data;
            head.next = head.next.next;

        }
        root.right = convertToBST(head, mid + 1, end);

        return root;
    }

    //Count the no of nodes in the LL
    public int countNodes() {
        int count = 0;
        Llist temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    //insert at the beginning into LinkedList
    public void insertintoLList(int data) {

        Llist temp = new Llist(data);

        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = head.prev;
        }
    }

    public void printLL() {

        Llist temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void preOrderBST(BST node) {

        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderBST(node.left);
        preOrderBST(node.right);
    }

    class Llist {
        int data;
        Llist next, prev;

        public Llist(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    class BST {
        int data;
        BST left, right;

        public BST(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


}
