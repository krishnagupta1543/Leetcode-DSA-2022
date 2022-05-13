// https://leetcode.com/problems/guess-number-higher-or-lower/

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 0;
        int l = n;
        while(s<=l){
            int mid = s+(l-s)/2;
            if(guess(mid) == 0){
                return mid;
            }
            else if(guess(mid) == -1){
                l = mid - 1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }
}
