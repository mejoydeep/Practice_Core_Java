package com.DataStructure.Tree;

public class Convert_SortedArray_To_BST {


    //convert and sorted array to a BST

    public static void main(String[] args) {

        int arr[] = {10, 12, 14, 16, 17};

        Convert_SortedArray_To_BST o = new Convert_SortedArray_To_BST();

        BST_Pojo root = o.arrayToBST(arr, 0, arr.length - 1);
        o.printeBST(root);
    }

    public BST_Pojo arrayToBST(int arr[], int left, int right) {

        BST_Pojo newNode = new BST_Pojo();
        if (left > right) {
            return null;
        }

        if (left == right) {
            newNode.setData(arr[left]);
            newNode.left = null;
            newNode.setRight(null);
        } else {
            int mid = left + (right - left) / 2;
            newNode.setData(arr[mid]);
            newNode.setLeft(arrayToBST(arr, left, mid - 1));
            newNode.setRight(arrayToBST(arr, mid + 1, right));
        }
        return newNode;
    }

    public void printeBST(BST_Pojo root) {

        if (root != null) {
            printeBST(root.left);
            System.out.print(root.getData() + " ");
            printeBST(root.right);
        }

    }
}
