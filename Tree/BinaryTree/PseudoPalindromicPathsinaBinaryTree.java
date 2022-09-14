// https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
class Solution {
     int count = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] arr = new int[10];
        count_ans(root,arr);
        return count;
    }
    public void count_ans(TreeNode root,int[]arr)     {
        if(root == null){
            return ;
        }
        arr[root.val]++;
        if(root.left == null && root.right == null){
            int odd = 0;
            for(int i = 1; i<arr.length; i++){
                if(arr[i]%2!=0){
                    odd++;
                }
            }
            if(odd == 1 || odd == 0) {
                count++;
            }
            arr[root.val]--;
            return;
        }
        count_ans(root.left, arr);
        count_ans(root.right, arr);
        arr[root.val]--;
    }
    
}
