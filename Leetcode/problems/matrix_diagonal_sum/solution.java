class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0;
        int j = mat.length-1;
        int jj = 0;
        int ans = 0;
        while(i < mat.length){
            ans += (mat[i][jj++] + mat[i++][j--]);
        }
        i = mat.length%2==0 ? 0 : mat[mat.length/2][mat.length/2];
        return ans-i;
    }
}