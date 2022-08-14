//https://leetcode.com/contest/weekly-contest-306/problems/largest-local-values-in-a-matrix/
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int i = 0;
        int j = 0;
        int[][] ans = new int[grid.length-2][grid.length-2];
        int mj = 0;
        int mi = 0;
        while(i < grid.length && j < grid.length){
            int summx = Integer.MIN_VALUE;
            int r = i;
            int c = j;
            int cl = j+2;
            int rl = i+2;
            if(cl >= grid.length){
                j = 0;
                i++;
                mi++;
                mj = 0;
                continue;
            }
            if(rl >= grid.length){
                break;
            }
            while(r <= rl){
                int col = c;
                while(col <= cl){
                    summx = Math.max(summx, grid[r][col]);
                    col++;
                }
                r++;
            }
            j++;
            ans[mi][mj] = summx;
            mj++;
        }
        return ans;
    }
}
