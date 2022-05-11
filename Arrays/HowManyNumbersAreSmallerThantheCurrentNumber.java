//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int [nums.length];
        for(int i = 0; i< nums.length; i++){
            int s =0;
        for(int j = 0; j < nums.length; j++)
        {
            int n = nums[j];
            
            if(nums[i] > n && i != j)
            {
                s++;
            }
            
        }
            arr[i] = s;
        }
        return arr;
    }
}
