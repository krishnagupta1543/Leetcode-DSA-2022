// https://leetcode.com/contest/weekly-contest-315/problems/sum-of-number-and-its-reverse/
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
    public boolean sumOfNumberAndReverse(int num) {
        for(int i = 0; i <= num; i++){
            int sum = i+reverse(i);
            if(sum == num){
                return true;
            }
        }
        return false;
    }
}
