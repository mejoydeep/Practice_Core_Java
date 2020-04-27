package com.DataStructure.Tree;

public class BinaryTree_Pojo {
    public int data;
    public BinaryTree_Pojo left;
    public BinaryTree_Pojo right;

    public BinaryTree_Pojo(int data) {
        this.data = data;
        left=null;
        right=null;
    }

    public int getData() {
        return data;
    }

    public BinaryTree_Pojo getLeft() {
        return left;
    }

    public BinaryTree_Pojo getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(BinaryTree_Pojo left) {
        this.left = left;
    }

    public void setRight(BinaryTree_Pojo right) {
        this.right = right;
    }
}
