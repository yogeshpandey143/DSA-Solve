package BinaryTree;

public class BinaryToDDL {

    class Node {
        Node left, right;
        int data;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    Node prev=null;

    Node bToDLL(Node root)
    {
        if (root==null)return null;

        Node head= bToDLL(root.left);

        if(prev==null)head=root;
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        bToDLL(root.right);
        return head;
    }
}
