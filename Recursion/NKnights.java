package com.company.Recursion.Backtracking;

public class NKnights {
    public static void main(String[] args){
        boolean [][] board = new boolean[4][4];
        Nknight(board, 0,0, 4);
    }
    public static void display(boolean[][] board){
        for(boolean[]arr : board){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]){
                    System.out.print("K"+" ");
                }else{
                    System.out.print("X"+" ");
                }
            }
            System.out.println();
        }
    }
    public static boolean isSafe(boolean[][] board, int row, int col){
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        return true;
    }
    public static boolean isValid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board[0].length){
            return true;
        }
        return false;
    }
    public static void Nknight(boolean[][] board, int row, int col, int knights){
        if(knights == 0){
            display(board);
            System.out.println();
            return;
        }
        if(row >= board.length-1 && col >= board[0].length){
            return;
        }
        if(col == board[0].length){
            Nknight(board,row+1, 0, knights);
            return;
        }
        if(isSafe(board, row, col)){
            board[row][col] = true;
            Nknight(board, row, col+1, knights-1);
            board[row][col] = false;
        }
        Nknight(board, row, col+1, knights);
    }
}

