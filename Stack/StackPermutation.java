// https://practice.geeksforgeeks.org/problems/stack-permutations/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class Solution {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        while(i!=ip.length && j != op.length){
            if(ip[i] == op[j]){
                i++;
                j++;
            }else if(stack.isEmpty()!=true && op[j] == stack.peek()){
                stack.pop();
                j++;
            }else if(ip[i] != op[j]){
                stack.push(ip[i]);
                i++;
            }
        }
        while(!stack.isEmpty()){
            if(op[j]!=stack.peek()){
                break;
            }
            j++;
            stack.pop();
        }
        if(j == n){
            return 1;
        }
        return 0;
    }
}
