//https://leetcode.com/problems/symmetric-tree/
class Solution {
    static boolean check(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null || p.val != q.val){
            return false;
        }
        return check(p.left, q.right) && check(p.right, q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return root == null || check(root, root);
    }
}
