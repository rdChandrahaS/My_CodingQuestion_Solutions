class Solution {
    int answer = 0;
    public void ans(int[][] grid,int i , int j,int remain){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0) return;
        else if(grid[i][j]==2){
            if(remain == 0)answer++;
            else return;
        }else if(grid[i][j]==-1) return;
        else{
            int[][] temp = new int[grid.length][grid[0].length];
            for (int x = 0; x < grid.length; x++) {
                temp[x] = grid[x].clone();
            }
            temp[i][j] = -1;
            remain--;
            ans(temp,i+1,j,remain);
            ans(temp,i-1,j,remain);
            ans(temp,i,j+1,remain);
            ans(temp,i,j-1,remain);
        }
    }
    public int uniquePathsIII(int[][] grid) {
        int remain = grid.length*grid[0].length;
        int i = 0;
        int j = 0;
        for(int a = 0 ; a < grid.length ; a++){
            for(int b = 0 ; b < grid[a].length ; b++){
                if(grid[a][b]==2 || grid[a][b]==-1) remain--;
                else if(grid[a][b]==1){
                    i=a;
                    j=b;
                }
            }
        }
        ans(grid,i,j,remain);
        return answer;
    }
}