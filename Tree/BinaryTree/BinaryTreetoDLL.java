// https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node prev = null;
    Node head = null;
    Node bToDLL(Node root)
    {
	//  Your code here	
	    helper(root);
	    return head;
    }
    void helper(Node root){
        if(root == null){
            return;
        }
        helper(root.left);
        if(prev == null){
            head = root;
        }else{
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        helper(root.right);
    }
}
