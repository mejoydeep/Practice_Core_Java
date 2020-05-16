package com.DataStructure.Tree;

public class BSTImpl {

    BST_Pojo root;

    public static void main(String[] args) {
        BSTImpl obj = new BSTImpl();
        obj.root = new BST_Pojo(10);
        obj.insertIntoBST(obj.root, 20);
        obj.insertIntoBST(obj.root, 6);
        obj.insertIntoBST(obj.root, 2);
        obj.insertIntoBST(obj.root, 16);
        obj.insertIntoBST(obj.root, 35);

        obj.printeBST(obj.root);

        System.out.println("\nMax Node: " + obj.maxNode(obj.root).data);
        System.out.println("\nMin Node: " + obj.mimNode(obj.root).data);

        obj.deleteNode(obj.root, 16);
        obj.printeBST(obj.root);


    }

    public BST_Pojo insertIntoBST(BST_Pojo root, int data) {

        if (root == null) {
            root = new BST_Pojo(data);

            if (root == null) {
                System.out.println("Memory error");
            } else {
                root.setLeft(null);
                root.setRight(null);
            }
        } else {
            if (data < root.getData()) {
                root.setLeft(insertIntoBST(root.getLeft(), data));
            } else if (data > root.getData()) {
                root.setRight(insertIntoBST(root.getRight(), data));
            }

        }
        return root;
    }

    public BST_Pojo mimNode(BST_Pojo root) {

        if (root == null) {
            return null;
        } else {
            if (root.getLeft() == null) {
                return root;
            } else return mimNode(root.getLeft());
        }
    }

    public BST_Pojo maxNode(BST_Pojo root) {

        if (root == null) {
            return null;
        } else {
            if (root.getRight() == null) {
                return root;
            } else return maxNode(root.getRight());
        }
    }

    public BST_Pojo deleteNode(BST_Pojo root, int data) {

        BST_Pojo temp;

        if (root == null) {
            System.out.println("No elements in the tree");
        } else if (data < root.data) {
            root.left = deleteNode(root.getLeft(), data);
        } else if (data > root.data) {
            root.right = deleteNode(root.getRight(), data);
        } else {
            if (root.getLeft() != null && root.getRight() != null) {
                temp = maxNode(root.getLeft());
                root.setData(temp.getData());
                root.left = deleteNode(root.getLeft(), temp.data);
            } else {
                if (root.getLeft() == null && root.getRight() == null) {
                    root = null;
                } else {
                    if (root.getLeft() == null) {
                        root = root.getRight();
                    }
                    if (root.getRight() == null) {
                        root = root.getLeft();
                    }
                }

            }
        }

        return root;
    }

    public void printeBST(BST_Pojo root) {

        if (root != null) {
            printeBST(root.left);
            System.out.print(root.getData() + "-> ");
            printeBST(root.right);
        }

    }

}
