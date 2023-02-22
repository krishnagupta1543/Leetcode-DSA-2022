// https://leetcode.com/problems/maximal-rectangle/description/
class Solution {
    public int largestRectangleArea(ArrayList<Integer> heights) {
        if(heights.size() == 0){
            return 0;
        }
        int[] left = Left(heights);
        int[] right = Right(heights);
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i < heights.size(); i++){
            int cal = (right[i] - left[i]+1)*heights.get(i);
            mx = Math.max(cal, mx);
        }
        return mx;
    }
    public static int[] Right(ArrayList<Integer> heights){
        int[] ans = new int[heights.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i = heights.size()-1; i>=0; i--){
            while(stack.isEmpty()!=true && heights.get(i) <= heights.get(stack.peek()))           {
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = heights.size()-1;
            }else{
                ans[i] = stack.peek()-1;
            }
            stack.push(i);
        }
        return ans;
    }
    public static int[] Left(ArrayList<Integer> heights){
        int[] ans = new int[heights.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<heights.size(); i++){
            while(stack.isEmpty()!=true && heights.get(i) <= heights.get(stack.peek())){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = 0;
            }else{
                ans[i] = stack.peek()+1;
            }
            stack.push(i);
        }
        return ans;
    }
    public int height(char[][] matrix, int row, int col){
        int ans = 0;
        while(row >= 0 && matrix[row][col]!='0'){
            ans++;
            row--;
        }
        return ans;
    }
    public int maximalRectangle(char[][] matrix) {
        int mxArea = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            ArrayList<Integer> mat = new ArrayList<>();
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == '1'){
                    int h = height(matrix, i, j);
                    mat.add(h);
                }else{
                    int area = largestRectangleArea(mat);
                    mxArea = Math.max(area, mxArea);
                    mat = new ArrayList<>();
                }
            }
            int area = largestRectangleArea(mat);
            mxArea = Math.max(area, mxArea);
        }
        return mxArea;
    }
}
