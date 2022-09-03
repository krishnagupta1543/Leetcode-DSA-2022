//https://leetcode.com/problems/numbers-with-same-consecutive-differences/
class Solution {
    static void helper(int n, int k,int num, int digit, List<Integer> ans){
        if(n == 0){
            ans.add(num);
            return;
        }
        if((digit+k)<=9){
            helper(n-1, k, num*10+(digit+k),digit+k,ans);
        }
        if(k!=0 && (digit-k)>=0){
            helper(n-1, k, num*10+(digit-k),digit-k,ans);
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i < 10; i++){
            helper(n-1, k, i,i, ans);
        }
        int[] a = new int[ans.size()];
        for(int j = 0; j < ans.size(); j++){
            a[j] = ans.get(j);
        }
        return a;
    }
}
