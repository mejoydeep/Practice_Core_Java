package com.DataStructure.Tree;

public class AVLTree_Insertion {

    AVL_Pojo node;

    public static void main(String[] args) {

        AVLTree_Insertion tree = new AVLTree_Insertion();
        tree.node = tree.insert(tree.node, 10);
        tree.node = tree.insert(tree.node, 20);
        tree.node = tree.insert(tree.node, 30);
        tree.node = tree.insert(tree.node, 40);
        tree.node = tree.insert(tree.node, 50);
        tree.node = tree.insert(tree.node, 25);

        System.out.println("Pre-Order traversal of the tree :  ");
        tree.preOrder(tree.node);
    }

    int height(AVL_Pojo node) {

        if (node == null) {
            return 0;
        }
        return node.height;
    }

    AVL_Pojo rightRotate(AVL_Pojo y) {

        AVL_Pojo x = y.left;
        AVL_Pojo z = x.right;

        x.right = y;
        y.left = z;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    AVL_Pojo left_rotate(AVL_Pojo y) {

        AVL_Pojo x = y.right;
        AVL_Pojo z = x.left;

        x.left = y;
        y.right = z;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    int getBalance(AVL_Pojo node) {

        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    public AVL_Pojo insert(AVL_Pojo node, int key) {

        if (node == null) {
            return new AVL_Pojo(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }
        if (balance < -1 && key > node.right.key) {
            return left_rotate(node);
        }
        if (balance > 1 && key > node.left.key) {
            node.left = left_rotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return left_rotate(node);
        }

        return node;
    }

    public void preOrder(AVL_Pojo node) {

        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

}
