package BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

/*
Spiral order Traversal mean: Starting from level 0 for root node, for all the even levels we print the node's value from right to left and for all the odd levels we print the node's value from left to right.

For below tree, function should return 1, 2, 3, 4, 5, 6, 7.
=
Example 1:

Input:
           10
         /     \
        20     30
      /    \
    40     60
Output: 10 20 30 60 40

 Input:

      1
    /   \
   3     2
Output:1 3 2
*/

public class LevelOrderTravSpiral {

    class Node{
        int data ;
        Node left;
        Node right;

        public Node(int data,Node left,Node right)
        {
            this.data=data;
            this.left = left;
            this.right=right;
        }
    }


    ArrayList<Integer> findSpiral(Node root)
    {
        // Your code here

        ArrayList<Integer> list= new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();


        if(root==null) return list;

        if(root.left == null && root.right==null )
        {
            list.add(root.data);
            return list;
        }

        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                Node curr = s1.pop();
                list.add(curr.data);
                if(curr.right!=null)s2.push(curr.right);
                if(curr.left!=null)s2.push(curr.left);
            }
            while(!s2.isEmpty())
            {
                Node curr = s2.pop();
                list.add(curr.data);

                if(curr.left!=null)s1.push(curr.left);
                if(curr.right!=null)s1.push(curr.right);
            }
        }

        return list;
    }
}
