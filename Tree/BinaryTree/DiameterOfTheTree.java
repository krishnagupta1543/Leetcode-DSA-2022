class Solution {
    public int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int ans = solve(root);
        return d;
    }
    public int solve(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = solve(root.left);
        int right = solve(root.right);
        d = Math.max(d, left+right);
        return Math.max(left, right)+1;
    }
}
