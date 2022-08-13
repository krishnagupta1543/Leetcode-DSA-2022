//https://leetcode.com/contest/weekly-contest-305/problems/longest-ideal-subsequence/
import java.util.*;
class Solution {
    public int longestIdealString(String s, int k) {
        int ans = 0;
       int [] dp = new int[26];
        for(int i = 0; i < s.length();i++){
            int element = s.charAt(i) - 'a';
            // left limit
            for(int j = element;j >= 0 && j >= element-k; j--){
                if(j == element && dp[j] == 0){
                    dp[j] = 1;
                    ans = Math.max(ans, dp[element]);
                    continue;
                }
                dp[element] = Math.max(dp[element], dp[j]+1);
            }
            // right limit
            for(int j = element+1 ; j < 26 && j <= element+k; j++){
                dp[element] = Math.max(dp[element], dp[j]+1);
            }
            ans = Math.max(ans, dp[element]);
        }
        return ans;
    }
}
