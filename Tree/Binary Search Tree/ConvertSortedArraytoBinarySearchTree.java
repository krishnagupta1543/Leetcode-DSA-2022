// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Time Complextity = O(N)
// Space complexity = O(1)
class Solution {
    static TreeNode find(int[] nums, int s, int e){
        if(e<s) return null;
        else if(s == e){
            return new TreeNode(nums[s]);
        }
        int mid =(s+e)/2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = find(nums, s, mid-1);
        n.right = find(nums, mid+1, e);
        return n;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return find(nums, 0, nums.length-1);
    }
}
