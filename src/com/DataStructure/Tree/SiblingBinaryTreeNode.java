package com.DataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SiblingBinaryTreeNode {
     int data;
     SiblingBinaryTreeNode left;
     SiblingBinaryTreeNode right;
     SiblingBinaryTreeNode nextSibling;

     static SiblingBinaryTreeNode root;

    public SiblingBinaryTreeNode(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
        this.nextSibling=null;
    }

    public SiblingBinaryTreeNode(int data, SiblingBinaryTreeNode left, SiblingBinaryTreeNode right, SiblingBinaryTreeNode nextSibling) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.nextSibling = nextSibling;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SiblingBinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(SiblingBinaryTreeNode left) {
        this.left = left;
    }

    public SiblingBinaryTreeNode getRight() {
        return right;
    }

    public void setRight(SiblingBinaryTreeNode right) {
        this.right = right;
    }

    public SiblingBinaryTreeNode getNextSibling() {
        return nextSibling;
    }

    public void setNextSibling(SiblingBinaryTreeNode nextSibling) {
        this.nextSibling = nextSibling;
    }

    //Iterative way

    public static void fillNextSibling(SiblingBinaryTreeNode root){

        if (root==null){
            return;
        }
        Queue<SiblingBinaryTreeNode> q=new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()){
            SiblingBinaryTreeNode temp=q.poll();

            if (temp !=null){
                temp.setNextSibling(q.peek());
                if (temp.getLeft() !=null){
                    q.offer(temp.getLeft());
                }
                if (temp.getRight() !=null){
                    q.offer(temp.right);
                }
            }
            else{
                if (!q.isEmpty()){
                    q.offer(null);
                }
            }
        }
    }

    //Recursive way

    public static  void fillNextSibling_Recursive(SiblingBinaryTreeNode root){

        if (root==null){
            return;
        }
        if (root.getLeft() !=null){
            root.getLeft().setNextSibling(root.getRight());
        }
        if (root.getRight() !=null){
            if (root.getNextSibling() !=null){
                root.getRight().setNextSibling(root.getNextSibling().getLeft());
            }
            else {
                root.getRight().setNextSibling(null);
            }
        }

        fillNextSibling_Recursive(root.getLeft());
        fillNextSibling_Recursive(root.getRight());
    }

    public static void printNextSibling(SiblingBinaryTreeNode root){

        if (root==null){
            System.out.println("B-Tree is empty");
        }
        else {
            Queue<SiblingBinaryTreeNode> q=new LinkedList<>();
            q.offer(root);

            while (!q.isEmpty()){
                SiblingBinaryTreeNode temp=q.poll();

                if (temp.nextSibling !=null)
                System.out.println(temp.getData()+" next sibling :"+temp.nextSibling.getData());
                else
                    System.out.println(temp.getData());

                if (temp.left !=null){
                    q.offer(temp.left);
                }
                if (temp.right!=null){
                    q.offer(temp.right);
                }

            }
        }

    }

    public static void main(String[] args) {
        root=new SiblingBinaryTreeNode(10);
        root.left=new SiblingBinaryTreeNode(12);
        root.left.left=new SiblingBinaryTreeNode(32);
        root.left.right=new SiblingBinaryTreeNode(6);
        root.right=new SiblingBinaryTreeNode(5);
        root.right.left=new SiblingBinaryTreeNode(43);
        root.right.right=new SiblingBinaryTreeNode(98);

        //fillNextSibling(root);
        fillNextSibling_Recursive(root);
        printNextSibling(root);

    }
}
