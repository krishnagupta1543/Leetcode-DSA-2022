// https://leetcode.com/problems/generate-parentheses/description/
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        return Gp(n, "", 0, 0, ans);     
    }
    public List<String> Gp(int n, String x, int open, int close, List<String> ans){
        if(x.length() == n*2){
            ans.add(x);
            return ans;
        }
        if(open < n){
            Gp(n, x+"(", open+1, close, ans);
        }
        if(close < open){
            Gp(n, x+")", open, close+1, ans);
        }
        return ans;
    }
}
