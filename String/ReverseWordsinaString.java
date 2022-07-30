// https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {
            String ans = "";
        s = s.trim();
        int i = s.length()-1;
        int j = i;
        while(i>-1){
            while(i>-1 && s.charAt(i)!=' '){
                i--;
            }
                ans+=s.substring(i+1, j+1);
            while(i>-1 && s.charAt(i)==' '){
                i--;
            }
            if(i>-1){
                ans+=" ";
            }

            j = i;
        }
        ans = ans.trim();
        return ans;
    }
}
