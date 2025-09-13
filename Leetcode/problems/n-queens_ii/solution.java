class Solution {
    int count = 0;
    private boolean isSafe(String[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++)
            if (board[i][col].equals("Q")) return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) 
            if (board[i][j].equals("Q")) return false;
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j].equals("Q")) return false;
        return true;
    }
    public void solver(String[][] board,int n,int row){
        if(row==n){
            count++;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,row,i,n)){
                board[row][i]="Q";
                solver(board,n,row+1);
                board[row][i]=".";
            }
        }
    }
    public int totalNQueens(int n) {
        String[][] board = new String[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = ".";
            }
        }
        solver(board,n,0);
        return count;
    }
}