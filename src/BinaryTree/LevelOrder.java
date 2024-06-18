package BinaryTree;
import BinaryTree.pepcoding.ConstructTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class LevelOrder {

    public class Node{
        int data;
        Node left,right;

        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right= null;

        }
    }
int idx=-1;
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




    public static void levelorder(Node root)
    {
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);


        while(!q.isEmpty())
        {
            Node curr = q.remove();

            if(curr==null)
            {
                System.out.println("");
                if(q.isEmpty()) break;
                else q.add(null);
            }
            else{
                System.out.print( " "+ curr.data);



            if(curr.left!=null) levelorder(root.left);
            if(curr.right!=null)  levelorder(root.right);

            }
        }



    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1,-1};
    LevelOrder tree = new LevelOrder();
Node root = tree.buildTree(arr);

        tree.levelorder(root);

    }
}
