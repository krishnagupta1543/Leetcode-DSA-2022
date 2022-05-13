// https://leetcode.com/problems/valid-perfect-square/
class Solution {
    public boolean isPerfectSquare(int num) {
        long s = 1;
        long e = num/2 ;
        while(s<=e){
            long m = s+(e - s)/2;
            if(m*m == num){
                return true;
            }
            else if(m*m > num){
                e = m - 1;
            }
            else{
                s = m+1;
            }
        }
        if(num == 2 || num == 1){
            return true;
        }else{
            return false;
        }
    }
}
