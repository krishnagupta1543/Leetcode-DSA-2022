// https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/
class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> (a[0]!=b[0])? b[0] - a[0]:a[1]-b[1]);
        int mx = Integer.MIN_VALUE;
        int ans = 0;
        for(int [] arr: properties){
            if(arr[1]<mx){
                ans++;
            }
            mx = Math.max(arr[1], mx);
        }
        return ans;
    }
}
