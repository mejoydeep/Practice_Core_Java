package com.DataStructure.Tree;

public class AVL_Pojo {

    public int key, height;
    public AVL_Pojo left, right;

    public AVL_Pojo(int key) {
        this.key = key;
        this.height = 1;
    }
}
