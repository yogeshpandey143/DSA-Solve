package BinaryTree.pepcoding;

import java.util.Stack;

public class TreeConsructor {


static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data= data;
        this.left=null;
        this.right= null;
    }
}

static class Pair{
    Node node;
    int state;
    Pair(Node node,int state)
    {
     this.node= node;
     this.state=state;
    }
}


  public static void display(Node root)
  {
      if(root==null)
      {
          return;
      }
      System.out.println(root.data);
      display(root.left);
      display(root.right);


  }
 static int i=-1;
  public static Node treeConst( int[] arr)
  {
      i++;
         if(arr[i]==-1)return null;

         Node node  = new Node(arr[i]);
         node.left = treeConst( arr);
         node.right = treeConst( arr);


return node;
  }


    public static void main(String[] args) {
    int arr[] ={50,32,12,-1,-1,37,30,-1,-1,-1,75,62,-1,70,-1,-1,87,-1,-1};
      Node root =  treeConst(arr);
        display(root);
    }



}
