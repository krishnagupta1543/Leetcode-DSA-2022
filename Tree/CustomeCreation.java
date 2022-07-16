package com.company;
import java.util.Scanner;
public class CustomeTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static class BinaryTree{
        public Node Buildtree(Node root){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the data: ");
            int data = in.nextInt();
            root = new Node(data);
            if(data == -1){
                return null;
            }
            System.out.println("Enter data for inserting in left: ");
            root.left = Buildtree(root.left);
            System.out.println("Enter the data for inserting in Right: ");
            root.right = Buildtree(root.right);
            return root;
        }
    }

    public static void main(String[] args) {
        Node root = null;
        BinaryTree tree = new BinaryTree();
        root = tree.Buildtree(root);
        System.out.println(root.data);
    }
}

