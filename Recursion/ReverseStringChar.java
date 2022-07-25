// https://leetcode.com/problems/reverse-string/
class Solution {
    public static void reverse(char[] ch, int s, int e){
        if(s>=e) return ;
        else {
            char c = ch[s];
            ch[s] = ch[e];
            ch[e] = c;
            reverse(ch, s+1, e-1);
        }
    }
    public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
        System.out.print(s);
    }
}
