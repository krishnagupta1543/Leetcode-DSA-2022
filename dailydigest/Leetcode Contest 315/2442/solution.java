// https://leetcode.com/contest/weekly-contest-315/problems/count-number-of-distinct-integers-after-reverse-operations/
class Solution {
    public static int reverse(int x){
            int ans = 0;
            while(x!=0){
                int rem = x%10;
                ans = ans*10+rem;
                x/=10;
            }
            return ans;
        }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length;i++){
            hs.add(nums[i]);
            int rev = reverse(nums[i]);
            hs.add(rev);
        }
        return hs.size();
    }
}
