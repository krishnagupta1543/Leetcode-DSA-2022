//https://leetcode.com/problems/remove-outermost-parentheses/

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> a = new Stack<>();
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(!a.isEmpty()){
                    ans+=ch;
                }
                a.add(ch);
            }else{
                a.pop();
                if(!a.isEmpty()){
                    ans += ch;
                }
            }
        }
        return ans;
    }
}
