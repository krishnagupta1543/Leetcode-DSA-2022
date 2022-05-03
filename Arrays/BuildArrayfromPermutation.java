// https://leetcode.com/problems/build-array-from-permutation/
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] p = new int[n];
        for(int i = 0; i < nums.length; i++)
        {
            p[i] = nums[nums[i]];
        }
        return p;
    }
}
