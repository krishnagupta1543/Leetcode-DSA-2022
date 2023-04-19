package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BstToMinHeap {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(){
            this.data = -1;
            left = right = null;
        }
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    public static Node buildHeap(Node root){
        System.out.println("Enter data: ");
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();
        if(data == -1){
            return null;
        }
        Node node = new Node(data);
        if(root == null){
            root = node;
        }
        System.out.println("Enter in left subtree: ");
        root.left = buildHeap(root.left);
        System.out.println("Enter in right subtree: ");
        root.right = buildHeap(root.right);
        return root;
    }
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void inOrder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }
    static int index = 0;
    public static void BSTtoMin(Node root){
        if(root == null){
            return;
        }
        root.data = arr.get(index);
        index+=1;
        BSTtoMin(root.left);
        BSTtoMin(root.right);
    }
    public static void prin(Node root)
    {
        if(root == null){
            return;
        }
        inOrder(root.left, arr);
        System.out.println(root.data);
        inOrder(root.right, arr);
    }
    public static void main(String[] args) {
        Node root = null;
        root = buildHeap(root);
        System.out.println(root.data);
        inOrder(root, arr);
        BSTtoMin(root);
        prin(root);
    }
}

