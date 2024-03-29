//https://leetcode.com/problems/balanced-binary-tree/
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        else {
            return Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }
    public static int height(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
}
