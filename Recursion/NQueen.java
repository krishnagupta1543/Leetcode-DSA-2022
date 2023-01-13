class Solution{
     public List<List<String>> solveNQueens(int n){
         boolean [][] board = new boolean[n][n];
         return nQueen(board, 0);
     }
     public List<String> display(boolean[][]board){
         List<String> ans = new ArrayList<>();
         for(boolean[] x: board){
             String p = "";
             for(int i = 0; i < x.length; i++){
                 if(x[i]){
                     p+= "Q";
                 }else{
                     p+=".";
                 }
             }
             ans.add(p);
         }
         return ans;
     }
     public boolean isSafe(boolean[][] board, int row, int col){
        int r = row;
        while(r >= 0){
            if(board[r][col]){
                return false;
            }
            r--;
        }
        int mxLeft = Math.min(row, col);
        for(int i = 1; i <= mxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int mxRight = Math.min(row, board.length-col-1);
        for(int i = 1; i <= mxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
     }
     public List<List<String>> nQueen(boolean[][] board, int row){
         if(row >= board.length){
             List<List<String>> x = new ArrayList<>();
             x.add(display(board));
             return x;
         }
         List<List<String>> x = new ArrayList<>();
         for(int col = 0; col < board[0].length; col++){
             if(isSafe(board, row, col)){
                 board[row][col] = true;
                 x.addAll(nQueen(board, row+1));
                 board[row][col] = false;
             }
         }
         return x;
     }
}
