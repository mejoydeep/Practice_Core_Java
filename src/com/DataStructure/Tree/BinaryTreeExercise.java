package com.DataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeExercise {

    BinaryTree_Pojo root;

    public int maxInBinaryTree(BinaryTree_Pojo root){

        int max_value=Integer.MIN_VALUE;

        if (root !=null){

            int left_value=maxInBinaryTree(root.left);
            int right_value=maxInBinaryTree(root.right);

            if (left_value>right_value){
                max_value=left_value;
            }
            else{
                max_value=right_value;
            }

            if (root.data>max_value){
                max_value=root.data;
            }
        }

        return max_value;

    }

    public int MaxInBinaryTree_Iterative(){

        int max=Integer.MIN_VALUE;
        Queue<BinaryTree_Pojo> q=new LinkedList<BinaryTree_Pojo>();
        q.offer(root);
        while (!q.isEmpty()){
            BinaryTree_Pojo temp=q.poll();

            if (temp.data>max){
                max=temp.data;
            }
            if (temp.getLeft() !=null){
                q.offer(temp.left);
            }
            if(temp.getRight() !=null){
                q.offer(temp.right);
            }
        }
        return max;
    }

    public boolean findElement(BinaryTree_Pojo root,int element){

       /* boolean flag=false;

        if (root !=null){
            if (root.data==element){
                flag=true;
            }
            else if (findElement(root.left,element)){
                flag=true;
            }
            else {
                flag=findElement(root.right,element);
            }
        }
        return flag;*/

       if (root==null){
           return false;
       }
       if (root.getData()==element){
           return true;
       }
       return findElement(root.left,element) || findElement(root.right,element);
    }

    public boolean findElement_Iterative(int element){
        Queue<BinaryTree_Pojo> q=new LinkedList<BinaryTree_Pojo>();

        if (root==null){
            return false;
        }
        q.offer(root);

        while (!q.isEmpty()){

            BinaryTree_Pojo temp=q.poll();

            if (temp.data==element){
                return true;
            }
            if (temp.left!=null){
                q.offer(temp.left);
            }
            if (temp.right!=null){
                q.offer(temp.right);
            }
        }

        return false;
    }

    public int findSize(BinaryTree_Pojo root){
        if(root==null){
            return 0;
        }
        int left_count=findSize(root.left);
        int right_count=findSize(root.right);

        return left_count+right_count+1;
    }

    public int findSize_Iterative(){

        int count =0;
        if(root==null){
            return 0;
        }
        Queue<BinaryTree_Pojo> q=new LinkedList<BinaryTree_Pojo>();
        q.offer(root);

        while (!q.isEmpty()){
            BinaryTree_Pojo temp=q.poll();
            count++;

            if (temp.left !=null){
                q.offer(temp.left);
            }
            if (temp.right !=null){
                q.offer(temp.right);
            }
        }

        return count;
    }

    public int findHeight(BinaryTree_Pojo root){
        if (root==null){
            return 0;
        }
        int left_height=findHeight(root.left);
        int right_height=findHeight(root.right);

        return (left_height>right_height) ? ++left_height: ++right_height;
    }

    //Find height using stack

    public int findHeightUsing_Stack(){
        if (root==null){
            return 0;
        }
        Stack<BinaryTree_Pojo> s=new Stack<BinaryTree_Pojo>();
        s.push(root);
        int maxHeight=0;
        BinaryTree_Pojo prev=null;
        while (!s.isEmpty()){
            BinaryTree_Pojo curr=s.peek();

            if (prev==null || prev.left==curr || prev.right==curr){
                if (curr.left!=null){
                    s.push(curr.left);
                }
                else if (curr.right !=null){
                    s.push(curr.right);
                }
            }
            else if (curr.left==prev){
                if (curr.right !=null){
                    s.push(curr.right);
                }
            }
            else {
                s.pop();
            }
            prev=curr;
            if (s.size()>maxHeight){
                maxHeight=s.size();
            }

        }
        return maxHeight;
    }

    //find Height In Iterative approach using queue

    public int findHeight_Iterative(){
        if (root==null) {
            return 0;
        }
            Queue<BinaryTree_Pojo> q=new LinkedList<BinaryTree_Pojo>();
            q.offer(root);
            int height =0;

            while (true){

                int node_Count=q.size();
                if (node_Count==0){
                    return height;
                }
                height++;

                while (node_Count>0){
                    BinaryTree_Pojo temp=q.poll();
                    if (temp.left!=null){
                        q.offer(temp.left);
                    }
                    if (temp.right !=null){
                        q.offer(temp.right);
                    }
                    node_Count--;
                }
            }

    }

    //printing an element into reverse order

    public void printIn_ReverseOrder(){
        if(root==null){
            return;
        }
        Queue<BinaryTree_Pojo>  q=new LinkedList<>();
        Stack<BinaryTree_Pojo>  s=new Stack<BinaryTree_Pojo>();
        q.offer(root);

        while (!q.isEmpty()){
            BinaryTree_Pojo temp=q.poll();

            if (temp.left!=null){
                q.offer(temp.left);
            }
            if (temp.right !=null){
                q.offer(temp.right);
            }

            s.push(temp);
        }

        while (!s.isEmpty()){
            System.out.print(s.pop().data+" ");
        }
    }

    //Find diameter of the tree
    public int calculateDiameter(BinaryTree_Pojo root){
        if (root==null){
            return 0;
        }
        int lHeight=findHeight(root.left);
        int rHeight=findHeight(root.right);

        int ldiameter=calculateDiameter(root.left);
        int rdiameter=calculateDiameter(root.right);

        return Math.max(lHeight+rHeight+1, Math.max(ldiameter,rdiameter));
    }

    public static void main(String[] args) {

        BinaryTreeExercise obj=new BinaryTreeExercise();

        obj.root = new BinaryTree_Pojo(10);
        obj.root.left = new BinaryTree_Pojo(12);
        obj.root.right = new BinaryTree_Pojo(9);
        obj.root.left.left = new BinaryTree_Pojo(13);
        obj.root.left.right = new BinaryTree_Pojo(5);

        System.out.println("Max in binaryTree: "+obj.maxInBinaryTree(obj.root) +" from iterative "+obj.MaxInBinaryTree_Iterative());
        System.out.println("Find element :"+obj.findElement(obj.root,0)+" from Iterative "+obj.findElement_Iterative(10));
        System.out.println("Size of a binary tree :"+obj.findSize(obj.root)+" from iterative "+obj.findSize_Iterative());
        System.out.println("Height of the B-Tree: "+obj.findHeight(obj.root)+" using stack "+obj.findHeightUsing_Stack()+" from Iterative "+obj.findHeight_Iterative());
        System.out.println("Reverse order of the binary tree : ");
        obj.printIn_ReverseOrder();

        System.out.println("\nDiameter of the tree :"+obj.calculateDiameter(obj.root));

    }
}
