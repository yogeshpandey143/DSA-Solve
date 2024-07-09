package Problems.tree;
/*
Given a binary tree. Find the size of its largest subtree that is a Binary Search Tree.
Note: Here Size is equal to the number of nodes in the subtree.


Input:
        1
      /   \
     4     4
   /   \
  6     8
Output: 1
Explanation: There's no sub-tree with size
greater than 1 which forms a BST. All the
leaf Nodes are the BSTs with size equal
to 1.
**/
public class LargestBST {

    static class Node{
        int data;
        Node left;
        Node right;

        public  Node(int data ,Node left,Node right ){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }


    static class Info{
        int size;
        int min;
        int max;
        public Info(int size,int min, int max){
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        Info info=largestBstUtil(root);
        return info.size;
    }
    public static Info largestBstUtil(Node root){
        if(root==null){
            return new Info(0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }


        Info leftInfo=largestBstUtil(root.left);
        Info rightInfo=largestBstUtil(root.right);

        // if data of root is greater than its left subtree maximum value then it is bst
        // if data of root is smaller  than its right subtree minimum value then it is bst
        if(root.data>leftInfo.max && root.data<rightInfo.min){
            int currSize = leftInfo.size+rightInfo.size+1;
            int max=Math.max(root.data,rightInfo.max);
            int min=Math.min(root.data,leftInfo.min);
            return new Info(currSize,min,max);
        }

        return new Info(Math.max(leftInfo.size,rightInfo.size),Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}

