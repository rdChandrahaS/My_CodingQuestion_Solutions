class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c)return mat;
        int[][] ans = new int[r][c];
        int a=0,b=0;
        for(int i=0; i<mat.length ;i++){
            for(int j=0;j<mat[0].length;j++){
                ans[a][b++]=mat[i][j];
                if(b==ans[0].length){
                    b=0;
                    a+=1;
                }
            }
        }
        return ans;
    }
}