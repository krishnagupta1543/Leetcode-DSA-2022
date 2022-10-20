//https://leetcode.com/problems/container-with-most-water/description/
class Solution {
    public int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int s = 0;
        int e = height.length-1;
        while(s<e){
            ans = Math.max(ans, (e-s)*Math.min(height[s],height[e]));
            if(height[s]<height[e]){
                s++;
            }else{
                e--;
            }
        }
        return ans;
    }
}
