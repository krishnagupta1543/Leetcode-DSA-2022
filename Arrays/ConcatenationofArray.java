// https://leetcode.com/problems/concatenation-of-array/
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] a = new int[2*n];
        for(int i = 0; i < n; i++)
        {
            a[i] = nums[i];
            a[n+i] = nums[i];
        }
        return a;
    }
}
