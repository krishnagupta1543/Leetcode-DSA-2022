// https://leetcode.com/problems/count-numbers-with-unique-digits/
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        int ans = 10;
        int current = 9;
        int start = 9;
        while(n>1){
            current*=(start--);
            ans+=current;
            n--;
        }
        return ans;
    }
}
