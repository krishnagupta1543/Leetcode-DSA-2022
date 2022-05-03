//  https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(i < nums.length){
            if(nums[i]==0) i++;
            else{
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j++;
            }
        }
    }
}
