// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
class Solution {
    public String[] collection = {"","", "abc", "def", "ghi", "jkl", "mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        return helper(digits, "");
    }
    public List<String> helper(String digits, String ans){
        if(digits.isEmpty()){
            List<String> a = new ArrayList<>();
            a.add(ans);
            return a;
        }
        List<String> a = new ArrayList<>();
        int index = (int)(digits.charAt(0) - '0');
        String str = collection[index];
        for(int i = 0; i < str.length(); i++){
            a.addAll(helper(digits.substring(1), ans+str.charAt(i)));
        }
        return a;
    }
}
