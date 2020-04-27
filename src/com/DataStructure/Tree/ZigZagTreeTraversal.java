package com.DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigZagTreeTraversal {
    public static BinaryTree_Pojo root;

    public List<Integer> getZigzagTraversal(){

        List<Integer> list=new ArrayList<Integer>();

        Stack<BinaryTree_Pojo> current=new Stack<>();
        Stack<BinaryTree_Pojo> next=new Stack<>();

        boolean leftToRight=true;

        current.push(root);

        while (!current.isEmpty()){
            BinaryTree_Pojo temp=current.pop();
            list.add(temp.getData());

            if (leftToRight){
                if (temp.left !=null){
                    next.push(temp.left);
                }
                if (temp.right !=null){
                    next.push(temp.right);
                }
            }
            else{
                if (temp.right !=null){
                    next.push(temp.right);
                }
                if (temp.left !=null){
                    next.push(temp.left);
                }
            }

            if (current.isEmpty()){
                leftToRight= !leftToRight;
                Stack<BinaryTree_Pojo> s=current;
                current=next;
                next=s;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        ZigZagTreeTraversal ob=new ZigZagTreeTraversal();

        root=new BinaryTree_Pojo(10);
        root.left=new BinaryTree_Pojo(32);
        root.right=new BinaryTree_Pojo(54);
        root.left.left=new BinaryTree_Pojo(5);
        root.left.right=new BinaryTree_Pojo(7);
        root.right.left=new BinaryTree_Pojo(21);
        root.right.right=new BinaryTree_Pojo(61);

        List<Integer> list=ob.getZigzagTraversal();

        System.out.println("Printing Zigzag list \n");
        list.forEach((e)-> System.out.print(e+" "));


    }
}
