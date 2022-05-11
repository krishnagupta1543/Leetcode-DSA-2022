//https://leetcode.com/problems/number-of-good-pairs/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for(int i =0 ; i < nums.length-1; i++)
        {
            for(int k = i+1; k < nums.length; k++)
            {
                if(nums[i] == nums[k])
                {
                    ans += 1;
                }
            }
        }
        return ans;
    }
}

