// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int s = 0;
        int e = letters.length-1;
        while(s < e){
            int mid = s+(e-s)/2;
            if(letters[mid] <= target){
                s = mid+1;
            }else if(letters[mid] > target){
                e = mid;
            }
        }
        if(s < letters.length && letters[s] > target){
            return letters[s];
        }else{
            return letters[0];
        }
    }
}
