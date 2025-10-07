class Solution {
    public boolean ans(char[][] board,char ch,int index,int i,int j,String st){
        if(i>=board.length || j>=board[0].length || i<0 || j<0) return false;
        if(board[i][j] != ch) return false;
        if(index==(st.length()-1) && board[i][j]==st.charAt(index))return true;
        
        char rec = board[i][j];
        board[i][j] = '*';
        char c = st.charAt(index+1);
        boolean found = ans(board,c,index+1,i+1,j,st) || 
                        ans(board,c,index+1,i,j+1,st) ||
                        ans(board,c,index+1,i-1,j,st) ||
                        ans(board,c,index+1,i,j-1,st);
        board[i][j] = rec;
        return found;        
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(board[i][j]==word.charAt(0)){
                    if(ans(board,board[i][j],0,i,j,word)){
                        return true;
                    }    
                }
            }
        }
        return false;
    }
}