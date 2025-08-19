class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix[0].length;
        int col = matrix.length;
        boolean firstRow = false;
        for(int j = 0 ; j < row ; j++){
            if(matrix[0][j]==0) firstRow = true;
        }
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                if(matrix[i][j]==0) matrix[0][j]=0;
            }
        }
        for(int j = 0 ; j < matrix[0].length ; j++){
            if( matrix[0][j]==0 ){
                int i = 0;
                while( i < col){ 
                    if( (i != 0) && (i < col) && (j < row) && (matrix[i][j]==0) ){
                        int left = j , right = j;
                        while( left > -1 ) matrix[i][left--]=0;
                        while( right < row ) matrix[i][right++]=0;
                    }
                    matrix[i][j] = 0;
                    i++;
                }
            }
        }
        if(firstRow){
            for(int j = 0 ; j < row ; j++) matrix[0][j]=0;
        }
    }
}