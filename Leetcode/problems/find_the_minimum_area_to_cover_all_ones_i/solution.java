class Solution {
    public int minimumArea(int[][] grid) {
        int a = grid.length;
        int b = -1;
        int c = grid.length;
        int d = -1;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(grid[i][j]==1){
                    a = Math.min(a,i);
                    d = Math.max(d,i);

                    c = Math.min(c,j);
                    b = Math.max(b,j);
                }
            }
        }
        int len = 1 + b - c;
        int bredth = 1 + d - a;

        return len*bredth;
    }
}