// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> a = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(a.isEmpty()){
                a.push(ch);
            }
            else{
                if(a.peek() == ch){
                    a.pop();
                }else{
                    a.push(ch);
                }
            }
        }
        String ans = "";
        while(!a.isEmpty()){
            ans=a.pop()+ans;
        }
        return ans;
    }
}

