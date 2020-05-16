package com.DataStructure.Tree;

public class BST_Exercise {

    public BST_Pojo root;

    // Finding the LCA of 2 nodes in the BST, Assuming that these 2 nodes are present in the BST

    public static void main(String[] args) {
        BST_Exercise o1 = new BST_Exercise();
        o1.root = new BST_Pojo(20);
        o1.root.left = new BST_Pojo(8);
        o1.root.left.left = new BST_Pojo(4);
        o1.root.left.right = new BST_Pojo(12);
        o1.root.left.right.left = new BST_Pojo(10);
        o1.root.left.right.right = new BST_Pojo(14);
        o1.root.right = new BST_Pojo(22);

        System.out.println("LCA of nodes :" + o1.findLCAof2Nodes(o1.root, 10, 22).data);
    }

    public BST_Pojo findLCAof2Nodes(BST_Pojo root, int n1, int n2) {

        while (root != null) {
            if (root.getData() > n1 && root.getData() > n2) {
                root = root.left;
            } else if (root.getData() < n1 && root.getData() < n2) {
                root = root.right;
            } else
                break;
        }
        return
                root;
    }
}
