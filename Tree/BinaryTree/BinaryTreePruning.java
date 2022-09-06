//https://leetcode.com/problems/binary-tree-pruning/
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null)
            return root;
        if(!haveone(root)){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root;
    }
    static boolean haveone(TreeNode node){
        if(node == null)
            return false;
        if(node.val == 1)
            return true;
        return haveone(node.left) || haveone(node.right);
    }
}
