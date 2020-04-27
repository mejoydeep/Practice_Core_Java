package com.DataStructure.Tree;

public class CheckIdenticalTrees {
    BinaryTree_Pojo root;

    public static boolean checkIdenTical(BinaryTree_Pojo b1,BinaryTree_Pojo b2){

        if (b1==null && b2==null){
            return  true;
        }

        return (b1.data==b2.data && checkIdenTical(b1.left,b2.left)
                && checkIdenTical(b1.right,b2.right));
    }

    public static void main(String[] args) {
        CheckIdenticalTrees obj1=new CheckIdenticalTrees();

        obj1.root=new BinaryTree_Pojo(10);
        obj1.root.left=new BinaryTree_Pojo(12);
        obj1.root.right=new BinaryTree_Pojo(15);

        CheckIdenticalTrees obj2=new CheckIdenticalTrees();

        obj2.root=new BinaryTree_Pojo(10);
        obj2.root.left=new BinaryTree_Pojo(12);
        obj2.root.right=new BinaryTree_Pojo(14);

        System.out.println("Check if 2 trees are identical :"+CheckIdenticalTrees.checkIdenTical(obj1.root,obj2.root));
    }
}
