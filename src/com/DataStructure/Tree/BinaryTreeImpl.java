package com.DataStructure.Tree;

import java.util.*;

public class BinaryTreeImpl {

    BinaryTree_Pojo root;

    public void preOrderTraversal_Recursive(BinaryTree_Pojo root) {

        if (root != null) {
            System.out.print(root.getData() + " ");
            preOrderTraversal_Recursive(root.left);
            preOrderTraversal_Recursive(root.right);
        }

    }

    public void preOrderTraversal_Iterative() {

        List<Integer> list = new ArrayList<Integer>();
        Stack<BinaryTree_Pojo> s = new Stack<BinaryTree_Pojo>();

        s.push(root);

        while (!s.isEmpty()) {
            BinaryTree_Pojo temp = s.pop();

            if (temp.right != null) {
                s.push(temp.right);
            }

            if (temp.left != null) {
                s.push(temp.left);
            }

            list.add(temp.data);
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    public void inOrderTraversal_Recursive(BinaryTree_Pojo root) {
        if (root != null) {
            inOrderTraversal_Recursive(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal_Recursive(root.right);
        }
    }

    public void inOrderTraversal_Iterative() {

        List<Integer> list = new ArrayList<>();
        Stack<BinaryTree_Pojo> s = new Stack<BinaryTree_Pojo>();
        boolean done = false;

        BinaryTree_Pojo current = root;

        while (!done) {

            if (current != null) {
                s.push(current);
                current = current.left;
            } else if (s.isEmpty()) {
                done = true;
            } else {
                current = s.pop();
                list.add(current.data);
                current = current.right;
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    public void postOrderTraversal_Recursive(BinaryTree_Pojo root) {
        if (root != null) {
            postOrderTraversal_Recursive(root.left);
            postOrderTraversal_Recursive(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void postOrderTraversal_Iterative() {

        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return;
        } else {
            Stack<BinaryTree_Pojo> s = new Stack<BinaryTree_Pojo>();
            BinaryTree_Pojo prev = null;
            s.push(root);

            while (!s.isEmpty()) {
                BinaryTree_Pojo temp = s.peek();

                if (prev == null || prev.left == temp || prev.right == temp) {
                    if (temp.left != null) {
                        s.push(temp.left);
                    } else if (temp.right != null) {
                        s.push(temp.right);
                    }
                } else if (temp.left == prev) {
                    if (temp.right != null) {
                        s.push(temp.right);
                    }
                } else {
                    list.add(temp.data);
                    s.pop();
                }
                prev = temp;
            }

        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }

    }


    //Level order traversal
    public void levelOrderTraversal() {
        Queue<BinaryTree_Pojo> q = new LinkedList<BinaryTree_Pojo>();
        List<Integer> list = new ArrayList<Integer>();
        q.offer(root);
        // q.offer(null);
        while (!q.isEmpty()) {
            BinaryTree_Pojo temp = q.poll();

            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }

            list.add(temp.data);
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        BinaryTreeImpl obj = new BinaryTreeImpl();

        obj.root = new BinaryTree_Pojo(10);
        obj.root.left = new BinaryTree_Pojo(12);
        obj.root.right = new BinaryTree_Pojo(9);
        obj.root.left.left = new BinaryTree_Pojo(13);
        obj.root.left.right = new BinaryTree_Pojo(5);
        obj.root.right.left = new BinaryTree_Pojo(65);
        obj.root.right.right = new BinaryTree_Pojo(23);

        //Calling inorder traversal
        System.out.println("Pre-Order traversal Recursive");
        obj.preOrderTraversal_Recursive(obj.root);
        System.out.println("\nPre-Order traversal Iterative");
        obj.preOrderTraversal_Iterative();


        System.out.println("\n\nIn-Order traversal");
        obj.inOrderTraversal_Recursive(obj.root);
        System.out.println("\nIn-Order traversal Iterative");
        obj.inOrderTraversal_Iterative();

        System.out.println("\n\nPost-Order traversal");
        obj.postOrderTraversal_Recursive(obj.root);
        System.out.println("\nPost-Order traversal Iterative");
        obj.postOrderTraversal_Iterative();

        System.out.println("\n\nLevel order traversal :");
        obj.levelOrderTraversal();


    }
}
