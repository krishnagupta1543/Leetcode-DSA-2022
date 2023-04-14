// https://practice.geeksforgeeks.org/problems/is-binary-tree-heap/1

class Solution {
    int count(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int l = count(root.left);
        int r = count(root.right);
        return (l+r+1);
    }
    boolean find(Node root, int index, int count){
        if(root == null){
            return true;
        }
        if(index >= count){
            return false;
        }
        return find(root.left, 2*index+1, count) && find(root.right, 2*index+2, count);
    }
	boolean isCompleteBT(Node root)
    {
          //add code here.
          int numOfNodes = count(root);
          boolean ans = find(root, 0, numOfNodes);
          return ans;
	} 
    boolean help1(Node tree){
        if(tree == null || tree.left == null && tree.right == null){
            return true;
        }
        if(tree.left != null && tree.left.data > tree.data){
            return false;
        }
        if(tree.right != null && tree.right.data > tree.data){
            return false;
        }
        boolean l = isHeap(tree.left);
        boolean r = isHeap(tree.right);
        return l&r;
    }
    boolean isHeap(Node tree) {
        // code here
        boolean ans1 = help1(tree);
        boolean ans2 = isCompleteBT(tree);
        return ans1&ans2;
    }
}
