package BinaryTree.pepcoding;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructTree {
    class Node
    {
        int data ;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
            this.left= null;
            this.right =null;

        }
    }
   static  int idx =-1;
public Node buildTree(int[] arr)
{
    idx++;
if(arr[idx]==-1)
{
    return null;
}
   Node node = new Node(arr[idx]);
   node.left = buildTree(arr);
   node.right = buildTree(arr);

   return node;
}

    // iteration of tree in preorder
public void preOrder(Node root)
{
    if(root==null) return ;
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
}




 public void leveOrder(Node root)
 {

     Queue<Node> queue= new LinkedList<>();
     // add first root node into queue
     queue.add(root);
     queue.add(null);
     while(!queue.isEmpty())
     {

//   remove the element from queue and take into currNode
       Node currNode = queue.remove();

      // ifcurr Node is null  print into next line
       if(currNode==null)
       {
           System.out.println("");
           if(queue.isEmpty()) break;
            else queue.add(null);
       }
         else{
           // if curr node is not null then print the data
           System.out.print(currNode.data);

           // if left of  currNode  not null then add currNode.left into queue
           if(currNode.left!=null)
          queue.add(currNode.left);
           // if right of  currNode  not null then add currNode.right into queue
            if(currNode.right!=null)
          queue.add(currNode.right);
       }
     }
 }


 public int  countNode( Node root)
 {

     if(root == null) return 0;
       int leftNode=  countNode(root.left);
       int rightNode = countNode(root.right);

         return leftNode +rightNode+1;
 }

 public int height(Node root)
 {

     if(root==null) return 0;
     //take the height  of left subtree
     int leftHeight = height(root.left);
     //take the height of right subtree
     int rightHeight = height(root.right);


     //take the maxheight btw leftHieght and rightHeight;
     int myHeight = Math.max(leftHeight,rightHeight) +1;
     return myHeight;
 }


 public int diameter(Node root)
 {
     if(root ==null) return 0;

     int dia1 = diameter(root.left);
     int dia2= diameter(root.right);
     int dia3 = height(root.left) +  height(root.right) +1;


     return Math.max(dia1,Math.max(dia2,dia3));
 }


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1,-1};
        ConstructTree tree = new ConstructTree();
        Node root = tree.buildTree(arr);
//        tree.preOrder(root);
//        tree.leveOrder(root);
        System.out.println(tree.countNode(root));
        System.out.println(tree.height(root));
        System.out.println(tree.diameter(root));
    }
}
