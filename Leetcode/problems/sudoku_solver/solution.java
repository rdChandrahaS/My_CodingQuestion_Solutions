class Solution {
    // public static boolean isSafe(char[][] board, int row, int col, char ch) {
    //     for (int i = 0; i < 9; i++) {
    //         if (board[row][i] == ch) return false;
    //         if (board[i][col] == ch) return false;
    //         int boxRow = 3 * (row / 3) + i / 3;
    //         int boxCol = 3 * (col / 3) + i % 3;
    //         if (board[boxRow][boxCol] == ch) return false;
    //     }
    //     return true;
    // }
    public static boolean isSafe(char[][] board,int row,int col,char ch){ 
        for(int i = 0 ; i < 9 ; i++){ 
            if(board[i][col]==ch) return false; 
            if(board[row][i]==ch) return false;    
        } 
        for(int i = (row/3)*3 ; i < ((row/3)*3) + 3 ; i++){ 
            for(int j = (col/3)*3 ; j < ((col/3)*3)+3 ; j++) { 
                if( board[i][j]== ch) return false; 
            } 
        } 
        return true; 
    }
    public static boolean solver(char[][] board,int row,int col){
        if(row == 9) return true;
        if(col == 9) return solver(board,row+1,0);
        if(board[row][col] > '0' && board[row][col]<='9') return solver(board,row,col+1);
        for(char ch = '1' ; ch <= '9' ; ch++){
            if(isSafe(board,row,col,ch)){
                board[row][col] = ch;
                if(solver(board,row,col+1)) return true;
                board[row][col] = '.';
            }
        }
        return false;
    }
    public static void solveSudoku(char[][] board) {
        solver(board,0,0);
    }
}