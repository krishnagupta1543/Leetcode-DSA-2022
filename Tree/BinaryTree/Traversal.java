package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class cheeck {
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
    //INORDER RECURSIVE
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //INORDER ITERATIVE
    public static ArrayList<Integer> inorderiterative(Node root){
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;
        while(true){
            if(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }else if(stack.isEmpty()){
                break;
            }else if(curr == null){
                Node temp = stack.pop();
                ans.add(temp.data);
                curr = temp.right;
            }
        }
        return ans;
    }
    //PREORDER ITERATIVE
    public static ArrayList<Integer> preorderiterative(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(true){
            if(curr!=null){
                ans.add(curr.data);
                stack.push(curr);
                curr = curr.left;
            }else if(stack.isEmpty()){
                break;
            }
            else if(curr == null){
                Node temp = stack.pop();
                curr = temp.right;
            }
        }
        return ans;
    }
    //PREORDER RECURSIVE
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node build(Node root){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data = in.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the data for left node: ");
        root.left = build(root);
        System.out.println("Enter the data for right node: ");
        root.right = build(root);
        return root;
    }
    // POSTORDER RECURSIVE
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    // POSTORDER ITERATIVE

    public static void main(String[] args) {
        Node node = null ;
        Node root= build(node);
        System.out.println("Root of the tree: " + root.data);
        inorder(root);
        System.out.println(inorderiterative(root));
        preorder(root);
        System.out.println(preorderiterative(root));
        postorder(root);
    }
}

