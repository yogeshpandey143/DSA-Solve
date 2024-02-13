package BinaryTree;

import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryImp binaryI = new BinaryImp();
        binaryI.populate(sc);
        binaryI.display();


    }
}
