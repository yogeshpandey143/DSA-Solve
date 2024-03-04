package BinaryTree.pepcoding;

import java.util.ArrayList;
import java.util.List;

public class NodeToRootPath {

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

//  Node to root path --->>> for that we have to find the element into the tree

//    to find the elemet in tree findEle() function

    public  boolean  findEle(Node root, int data, List<Integer> list)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data==data)
        {
            list.add(root.data);
            return true;
        }

        boolean findInLeft =findEle(root.left, data,list);
        if(findInLeft) {
            list.add(root.data);
            return true;
        }

        boolean findInRight =findEle(root.right, data,list);
        if(findInRight) {
            list.add(root.data);
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1,-1};


        NodeToRootPath ntrp = new NodeToRootPath();
       Node root = ntrp.buildTree(arr);

       List<Integer> list  = new ArrayList<>();
        System.out.println(ntrp.findEle(root, 3,list));

        System.out.println(list);
    }
}
