// https://practice.geeksforgeeks.org/problems/check-for-bst/1
public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        // return isBST(root, -Integer.MIN_VALUE, Integer.MAX_VALUE);
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int i = 1;
        while(i < arr.size()){
            if(arr.get(i)<arr.get(i-1)){
                return false;
            }
            i++;
        }
        return true;
    }
    static void inorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return ;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);    
    }
    // aprroach 2
    // static boolean isBST(Node node, int min, int max){
    //     if(node == null){
    //         return true;
    //     }
    //     if(node.data < min || node.data>max){
    //         return false;
    //     }
    //     return isBST(node.left, min, node.data-1) && isBST(node.right, node.data+1, max);
    // }
    
}
