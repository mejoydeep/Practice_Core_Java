package com.DataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeExercise2 {

    BinaryTree_Pojo root;

    public int getMax_Width(){
        int max_width=0;
        int height=height(root);
        for (int i=1;i<=height;i++){
            int tempWidth=getLevelWidth(root,i);

            if (tempWidth>max_width){
                max_width=tempWidth;
            }
        }

        return max_width;
    }

    public int getLevelWidth(BinaryTree_Pojo root, int height){
        if (root==null){
            return 0;
        }
        if (height==1){
            return 1;
        }
        else{
            return getLevelWidth(root.left,height-1) + getLevelWidth(root.right,height-1);
        }
    }

    public int height(BinaryTree_Pojo root){

        if (root==null){
            return 0;
        }
        int left_height=height(root.left);
        int right_height=height(root.right);

        return (left_height>right_height) ? left_height+1 :right_height+1;
    }

    public int width_Using_Queue(){
        if (root ==null){
            return 0;
        }
        Queue<BinaryTree_Pojo> q=new LinkedList<BinaryTree_Pojo>();
        q.offer(root);
        int max_Width=0;
        int max_Sum=0;

        while (!q.isEmpty()){

            int size=q.size();
            if (size>max_Width){
                max_Width=size;
            }

            int levelSum=0;
            while (size-->0){

                BinaryTree_Pojo temp=q.poll();
                levelSum +=temp.data;

                if (temp.left !=null){
                    q.offer(temp.left);
                }
                if (temp.right !=null){
                    q.offer(temp.right);
                }
            }

            //Calculating the maximum sum in each level and comparing

            if (levelSum>max_Sum){
                max_Sum=levelSum;
            }
        }

        System.out.println("Maximum Sum :"+max_Sum);

        return max_Width;
    }

    public void printPaths(BinaryTree_Pojo root){
        int[] path=new int[256];
        printPaths(root,path,0);
    }

    public void printPaths(BinaryTree_Pojo root, int[] path, int pathlen){

        if (root==null){
            return;
        }
        path[pathlen]=root.getData();
        pathlen++;

        if (root.left ==null && root.right==null){
            printpath(path,pathlen);
        }
        else {
            printPaths(root.left,path,pathlen);
            printPaths(root.right,path,pathlen);
        }

    }

    public void printpath(int[] arr, int pos){

        for (int i=0;i<pos;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        BinaryTreeExercise2 obj=new BinaryTreeExercise2();

        obj.root=new BinaryTree_Pojo(10);
        obj.root.left=new BinaryTree_Pojo(12);
        obj.root.right=new BinaryTree_Pojo(45);
        obj.root.right.right=new BinaryTree_Pojo(15);
        obj.root.right.left=new BinaryTree_Pojo(1);
        obj.root.left.right=new BinaryTree_Pojo(5);

        System.out.println("Max width :"+obj.getMax_Width());
        System.out.println("Max width from queue :"+obj.width_Using_Queue());

        System.out.println("Paths of the tree");
        obj.printPaths(obj.root);
    }
}
