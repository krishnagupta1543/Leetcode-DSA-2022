class Solution {
    // public int solve(int len, int zero, int one, int mod){
    //     if(len == 0) return 1;
    //     if(len < 0) return 0;
    //     int sum = (solve(len-zero, zero, one, mod)+solve(len-one, zero, one, mod))%mod;
    //     return sum;
    // }

    // public int countGoodStrings(int low, int high, int zero, int one) {
    //     // recurisive apporach
    //     int mod = 1000000007;
    //     int sum = 0;
    //     for(int i = low; i <= high; i++){
    //         sum += solve(i, zero, one, mod)%mod;
    //     }
    //     return sum;
    // }
    public int solve(int len, int zero, int one, int mod, int[] dp){
        if(len == 0) return 1;
        if(len < 0) return 0;
        if(dp[len] != -1) return dp[len];
        int ans = (solve(len-zero,zero, one, mod, dp)+solve(len-one, zero, one, mod, dp))%mod;
        dp[len] = ans;
        return dp[len];
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp;
        dp = new int[high+1];
        int ans = 0;
        int mod = 1000000007;
         Arrays.fill(dp, -1);
        for(int i = low; i <= high; i++){
            ans =(ans+solve(i, zero, one, mod, dp))%mod;
        }
        return ans;
    }
}

