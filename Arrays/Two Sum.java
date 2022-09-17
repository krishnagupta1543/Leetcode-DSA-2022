// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] a = new int[2];
        for(int i = 0; i < nums.length-1; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[i]+nums[j] == target){
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }
        return a;
    }
}
// Approach 2 using hashmap
//Time complexity = O(N)
// space complexity = O(N)
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < nums.length; i++){
//            if(map.containsKey(target-nums[i])){
//                return new int[]{i, map.get(target-nums[i])};
//            }
//             map.put(nums[i], i);
//        }
//         return new int[]{};
        
//     }
// }
