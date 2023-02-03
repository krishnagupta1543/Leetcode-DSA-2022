// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/
class Solution {
    public char[] minRemove(char[] ch){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '('){
                stack.push(i);
            }else if(ch[i] == ')' && stack.isEmpty()){
                    ch[i] = '*';
            }
            else if(ch[i] == ')' && ch[stack.peek()] == '('){
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            ch[stack.peek()] = '*';
            stack.pop();
        }
        return ch;
    }
    public String minRemoveToMakeValid(String s) {
        char[] ch = s.toCharArray();
        char[] ansch = minRemove(ch);
        String ans = "";
        for(int i = 0; i < ansch.length; i++){
            if(ansch[i] != '*'){
                ans+=ansch[i];
            }
        }
        return ans;
    }
}
