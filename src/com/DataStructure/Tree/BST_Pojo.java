package com.DataStructure.Tree;

public class BST_Pojo {
    public int data;
    public BST_Pojo left;
    public BST_Pojo right;

    public BST_Pojo() {

    }

    public BST_Pojo(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BST_Pojo getLeft() {
        return left;
    }

    public void setLeft(BST_Pojo left) {
        this.left = left;
    }

    public BST_Pojo getRight() {
        return right;
    }

    public void setRight(BST_Pojo right) {
        this.right = right;
    }
}
