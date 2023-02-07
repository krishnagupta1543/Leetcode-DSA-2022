// https://leetcode.com/problems/binary-tree-preorder-traversal/description/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // public List<Integer> helper(TreeNode root, List<Integer> list)
    // {
    //     if(root == null){
    //         return list;
    //     }
    //     list.add(root.val);
    //     if(root.left!=null){
    //         helper(root.left, list);
    //     }
    //     if(root.right != null){
    //         helper(root.right, list);
    //     }
    //     return list;
    // }
    // Time complexity O(N)
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while(root!=null){
            ans.add(root.val);

            if(root.right !=null){
                stack.push(root.right);
            }

            root = root.left;

            if(root == null && !stack.isEmpty()){
                root = stack.pop();
            }
        }
        return ans;
    }
}
