package com.DataStructure.Tree;

public class BinartTree_To_DLL {

    static BST_Pojo prev = null;
    static BST_Pojo prevv;
    BST_Pojo root, head;

    //Way 1

    public static void main(String[] args) {
        BinartTree_To_DLL o1 = new BinartTree_To_DLL();

        o1.root = new BST_Pojo(20);
        o1.root.left = new BST_Pojo(8);
        o1.root.left.left = new BST_Pojo(4);
        o1.root.left.right = new BST_Pojo(12);
        o1.root.left.right.left = new BST_Pojo(10);
        o1.root.left.right.right = new BST_Pojo(14);
        o1.root.right = new BST_Pojo(22);

        //o1.binaryTreeToDll(o1.root);
        //o1.printDLL(o1.head);

        System.out.println();
        BST_Pojo node = o1.bstToDll();
        o1.printDLL(node);

    }

    public void binaryTreeToDll(BST_Pojo root) {

        if (root == null) {
            return;
        }
        binaryTreeToDll(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        binaryTreeToDll(root.right);
    }

    //Way 2

    public void printDLL(BST_Pojo node) {

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }

    public BST_Pojo bstToDll() {
        prevv = null;

        fixPrevPtr(root);

        return fixNextPtr(root);
    }

    public void fixPrevPtr(BST_Pojo root) {

        if (root == null) {
            return;
        }
        fixPrevPtr(root.left);
        root.left = prev;
        prevv = root;
        fixPrevPtr(root.right);
    }

    public BST_Pojo fixNextPtr(BST_Pojo root) {

        while (root.right != null) {
            root = root.right;
        }

        while (root != null && root.left != null) {
            BST_Pojo left = root.left;
            left.right = root;
            root = root.left;
        }

        return root;
    }
}
