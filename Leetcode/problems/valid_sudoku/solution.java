class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> temp = new HashSet<>();
        int i,j,k;

        for(i=0;i<9;i++){
            //horizontally
            for(j=0;j<9;j++){
                if( board[i][j]=='.')continue;
                if( !temp.add(board[i][j]) ) return false;
            }
            temp.clear();
            //vertically
            for(j=0;j<9;j++){
                if( board[j][i]=='.')continue;
                if( !temp.add(board[j][i]) )return false;
            }
            temp.clear();
        }
        for(k=0;k<9;k++){
            for(i = (k/3)*3 ; i < ((k/3)*3) + 3 ; i++){
                for(j = (k%3)*3 ; j < ((k%3)*3)+3 ; j++){
                    if( board[j][i]=='.')continue;
                    if( !temp.add(board[j][i]) )return false;
                }
            }
            temp.clear();
        }
        return true;
    }
}