//https://leetcode.com/problems/reshape-the-matrix/
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] matrix = new int[r][c];
        int row = mat.length;
        int col = mat[0].length;
        int r1 = 0;
        int c1 = 0;
        if(r*c == row*col){
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++)
                {
                   if(c1 >= c){
                       r1++;
                       c1 = 0;
                   }
                    matrix[r1][c1] = mat[i][j];
                    c1++;
                }
            }
            return matrix;
        }
        else{
                return mat;
            }
    }
}
