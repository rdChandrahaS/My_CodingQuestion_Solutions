class Solution {
    List<List<String>> ans = new ArrayList<>();
    private boolean isSafe(String[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++)// Check vertical up
            if (board[i][col].equals("Q")) return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) // Check upper-left diagonal
            if (board[i][j].equals("Q")) return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)// Check upper-right diagonal
            if (board[i][j].equals("Q")) return false;

        return true;
    }

    public void solver(String[][] board,int n,int row){
        if(row==n){
            List<String> temp = new ArrayList<String>();
            for(int i=0;i<n;i++){
                String res = String.join("", board[i]);
                temp.add(res);
            }
            ans.add(temp);
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,row,i,n)){
                board[row][i]="Q";
                solver(board,n,row+1);
                board[row][i]=".";
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        String[][] board = new String[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = ".";
            }
        }
        solver(board,n,0);
        return ans;
    }
}