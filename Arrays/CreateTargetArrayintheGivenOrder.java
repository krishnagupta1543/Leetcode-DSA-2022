//https://leetcode.com/problems/create-target-array-in-the-given-order/
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            int indx = index[i];
            int value = nums[i];
            list.add(indx, value);
        }
        int[] ans = new int[list.size()];
        for(int k = 0; k < list.size(); k++)
        {
            ans[k] = list.get(k);
        }
        return ans;
    }
}
