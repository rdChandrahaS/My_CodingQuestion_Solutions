class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int i = 0;
        int j = grid.length-1;
        int row = grid.length;
        while(j > 0){
            int[] loc = new int[row-j];
            int row_pos = j;
            int jj = j;
            int column_pos = 0;
            int ii = 0;
            while(row_pos < row) loc[column_pos] = grid[column_pos++][row_pos++];
            Arrays.sort(loc);
            while(ii < loc.length) grid[ii][jj++] = loc[ii++];
            j--;
        }
        j = 0;
        while( i < row){
            int[] loc = new int[row-i];
            int ii = i;
            int a = i;
            int jj = 0;
            int b = 0;
            while(ii < row) loc[jj] = grid[ii++][jj++];
            loc = Arrays.stream(loc)
                           .boxed()
                           .sorted((p,q) -> q-p)
                           .mapToInt(Integer::intValue)
                           .toArray();
            while( b < loc.length )grid[a++][b] = loc[b++];
            i++;
        }
        return grid;
    }
}