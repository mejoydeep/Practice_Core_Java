package com.DataStructure.Tree;

import java.util.HashMap;
import java.util.Map;

public class VerticalSum {

    public static BinaryTree_Pojo root;

    public void getVerticalTreeTraversal(){

        //We can use TreeMap if we want to maintain the key order

        HashMap<Integer,Integer> map=new HashMap<>();
        vSum(map,0,root);

        for (Map.Entry<Integer,Integer> e: map.entrySet()){
            System.out.println("Index :"+e.getKey()+" Value:"+e.getValue());
        }

    }

    public void vSum(HashMap<Integer,Integer> map,int index, BinaryTree_Pojo root){
        int data=0;

      if (root.left !=null){
          vSum(map,index-1,root.left);
      }
      if (root.right !=null){
          vSum(map,index+1,root.right);
      }

      if (map.containsKey(index)){
          data=map.get(index);
      }
      map.put(index,root.data+data);

    }


    public static void main(String[] args) {
        VerticalSum ob=new VerticalSum();

        root=new BinaryTree_Pojo(10);
        root.left=new BinaryTree_Pojo(32);
        root.right=new BinaryTree_Pojo(54);
        root.left.left=new BinaryTree_Pojo(5);
        root.left.right=new BinaryTree_Pojo(7);
        root.right.left=new BinaryTree_Pojo(21);
        root.right.right=new BinaryTree_Pojo(61);

        ob.getVerticalTreeTraversal();
    }
}
