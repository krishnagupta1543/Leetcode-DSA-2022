// https://leetcode.com/problems/is-subsequence/
class Solution {
    static boolean sequence(String s,String t){
        int i = 0;
        int j = 0;
        while(i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }
        if(j==t.length()){
            return true;
        }else{
            return false;
        }
    }
    public boolean isSubsequence(String s, String t) {
        return sequence(t, s);
    }
}
