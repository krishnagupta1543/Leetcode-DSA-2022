//https://leetcode.com/problems/plus-one/
class Solution {
    public int[] plusOne(int[] digits) 
    {
        int carry = 1;
        int n = digits.length;
        for(int i = n-1;i>=0;i--){
            digits[i] += carry;
            if(digits[i]==10){
                carry = 1;
                digits[i] = 0;
            }else{
                carry = 0;
                break;
            }
        }
        if(carry == 1){
            int tem[] = new int[n+1];
            tem[0] = 1;
            return tem;
        }else{
            return digits;
        }
        
}
}
