//https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < st.length; i++){
            if(st[i] == '(' || st[i] == '[' || st[i] == '{'){
                stack.push(st[i]);
            }
            else{
                if(stack.empty())
                {
                    return false;
                }
                if(st[i] == ')' && stack.pop()!='('){
                    return false;
                }
                if(st[i] == '}' && stack.pop()!='{'){
                    return false;
                }
                if(st[i] == ']' && stack.pop()!='['){
                    return false;
                }
            }
        }
        return stack.empty();
        
    }
}
