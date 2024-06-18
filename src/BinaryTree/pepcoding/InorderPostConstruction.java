package BinaryTree.pepcoding;
import java.io.*;



class Node {
    int data;
    Node left, right;

    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}


public class InorderPostConstruction {


        Node buildUtil(int in[], int post[], int inStrt,
                       int inEnd, int postStrt, int postEnd)
        {
            // Base case
            if (inStrt > inEnd)
                return null;

        /* Pick current node from Postorder traversal using
           postIndex and decrement postIndex */
            Node node = new Node(post[postEnd]);

            /* If this node has no children then return */


            if (inStrt == inEnd)
                return node;
            int iIndex = search(in, inStrt, inEnd, node.data);

        /* Using index in Inorder traversal, construct left
           and right subtrees */
            node.left = buildUtil(in, post, inStrt, iIndex - 1, postStrt, postStrt - inStrt + iIndex - 1);
            node.right = buildUtil(in, post, iIndex + 1, inEnd, postEnd - inEnd + iIndex, postEnd - 1);

            return node;
        }

        /* Function to find index of value in arr[start...end]
           The function assumes that value is postsent in in[]
         */
        int search(int arr[], int strt, int end, int value)
        {
            int i;
            for (i = strt; i <= end; i++) {
                if (arr[i] == value)
                    break;
            }
            return i;
        }

        /* This function is here just to test  */
        void preOrder(Node node)
        {
            if (node == null)
                return;
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

        // Driver Code
        public static void main(String[] args)
        {
            InorderPostConstruction tree = new InorderPostConstruction();
            int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 };
            int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 };
            int n = in.length;
            Node root
                    = tree.buildUtil(in, post, 0, n - 1, 0, n - 1);
            System.out.println(
                    "Preorder of the constructed tree : ");
            tree.preOrder(root);
        }
    }