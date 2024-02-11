package BinaryTree;
import java.util.*;
public class BinaryImp {

    class Node{
         int data;
         Node  right;
         Node  left;

        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    private Node root;

    public void populate(Scanner scanner ){
        System.out.println("Enter the root node: ");
        int value =scanner.nextInt();
        root = new Node(value);
        populate( scanner ,root);
    }

    public void display(){
        display(root);
    }


    public void display(Node root)
    {
        if(root == null)return;
        System.out.println(root.data);
        display(root.left);
        display(root.right);

    }
    public void populate(Scanner sc, Node root){

        System.out.println("Do youwant to  stop");
        Boolean stop = sc.nextBoolean();
        if(stop){
            return;
        }

        System.out.println("Do you want to add the vale at left of "+root.data);

        boolean leftSide =  sc.nextBoolean();
        if(leftSide)
        {
            System.out.println("Enter the value for left node ");
            int value  = sc.nextInt();
            root.left= new Node(value);
            populate( sc ,root.left);

        }
        else{
            System.out.println("Enter the value for right node ");
            int value  = sc.nextInt();
            root.right= new Node(value);
            populate( sc ,root.right);
        }





    }

}
