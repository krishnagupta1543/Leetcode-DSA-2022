class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left = left(heights);
        int [] right = right(heights);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int cal = (right[i]-left[i]-1)*heights[i];
            max = Math.max(cal, max);
        }
        return max;
    }
    public static int[] right(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--){
            while(stack.isEmpty()!=true && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = arr.length;
            }else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    public static int[] left(int [] arr){
        int [] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(stack.isEmpty()!=true && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}
