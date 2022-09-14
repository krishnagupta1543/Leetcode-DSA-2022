//https://practice.geeksforgeeks.org/problems/delete-a-node-from-bst/1
class Tree {
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int x) {
        // code here.
        if(root == null) return root;
        else if(root.data>x)
            root.left = deleteNode(root.left, x);
        else if(root.data<x)
            root.right = deleteNode(root.right, x);
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }else{
                root.data = inorder_successor(root.right);
                root.right = deleteNode(root.right, root.data);
            }
        }
        return root;
    }
    static int inorder_successor(Node node){
        while(node.left!=null){
            node = node.left;
        }
        return node.data;
    }
}
