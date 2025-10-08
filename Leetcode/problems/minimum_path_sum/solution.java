class Solution {
    public void rec(int[][] grid){}
    public int minPathSum(int[][] grid) {
        int lenV = grid.length;
        int lenH = grid[0].length;
        for(int i = lenV-1 ; i >= 0 ; i--){
            for(int j = lenH-1 ; j >= 0 ; j--){
                if(i==lenV-1 && j==lenH-1)continue;
                int down = (i + 1 < lenV) ? grid[i + 1][j] : Integer.MAX_VALUE;
                int right = (j + 1 < lenH) ? grid[i][j + 1] : Integer.MAX_VALUE;
                grid[i][j] += Math.min(down, right);
            }
        }
        return grid[0][0] ;
    }
}