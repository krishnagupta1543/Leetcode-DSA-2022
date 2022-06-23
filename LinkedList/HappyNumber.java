// https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findsqr(slow);
            fast = findsqr(findsqr(fast));
        }while(slow!=fast);
        if(slow == 1){
            return true;
        }else{
          return false;
        }
    }
    public static int findsqr(int n){
        int sum = 0;
        while(n > 0){
            int r = n%10;
            sum += r*r;
            n/=10;
        }
        return sum;
    }
}
