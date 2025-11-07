class Pair {
    int[][] arr;
    int val;
    int steps;
    Pair(int[][] arr, int val, int steps) {
        this.arr = arr;
        this.val = val;
        this.steps = steps;
    }
}

class Solution {
    HashSet<String> memory = new HashSet<>();
    Queue<Pair> pos = new PriorityQueue<>((a,b)->a.val - b.val);    
    int[][] ans = new int[][]{{1,2,3},{4,5,0}};
    Pair temp;

    public int hurestic(int[][] board){
        int a = 0;
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if (board[i][j] != 0 && ans[i][j] != board[i][j]) a++;
            }
        }
        return a;
    }
    public int slidingPuzzle(int[][] board) {
        return recursion(board);
    }

    public int recursion(int[][] board){
        pos.offer(new Pair(board, hurestic(board) + 0, 0));        
        memory.add(Arrays.deepToString(board));

        while(!pos.isEmpty()){
            Pair temp = pos.poll();
            int[][] grid = temp.arr;
            if(hurestic(grid)==0) return temp.steps;            
            int[][] arr = null;       
            for(int i = 0 ; i < 2 ; i++){
                for(int j = 0 ; j < 3 ; j++){
                    if(grid[i][j]==0){
                        if(j > 0){
                            arr = new int[2][3];
                            for (int x = 0; x < 2; x++)
                                arr[x] = grid[x].clone();
                            arr[i][j] = arr[i][j-1]^arr[i][j]^(arr[i][j-1] = arr[i][j]);
                            String key = Arrays.deepToString(arr);
                            if (memory.add(key))
                                pos.offer(new Pair(arr, hurestic(arr) + temp.steps + 1, temp.steps + 1));
                        }if(j < 2){
                            arr = new int[2][3];
                            for (int x = 0; x < 2; x++)
                                arr[x] = grid[x].clone();
                            arr[i][j] = arr[i][j+1]^arr[i][j]^(arr[i][j+1] = arr[i][j]);
                            String key = Arrays.deepToString(arr);
                            if (memory.add(key))
                                pos.offer(new Pair(arr, hurestic(arr) + temp.steps + 1, temp.steps + 1));
                        }if(i > 0){
                            arr = new int[2][3];
                            for (int x = 0; x < 2; x++)
                                arr[x] = grid[x].clone();
                            arr[i][j] = arr[i-1][j]^arr[i][j]^(arr[i-1][j] = arr[i][j]);
                            String key = Arrays.deepToString(arr);
                            if (memory.add(key))
                                pos.offer(new Pair(arr, hurestic(arr) + temp.steps + 1, temp.steps + 1));
                        }if(i < 1){
                            arr = new int[2][3];
                            for (int x = 0; x < 2; x++)
                                arr[x] = grid[x].clone();
                            arr[i][j] = arr[i+1][j]^arr[i][j]^(arr[i+1][j] = arr[i][j]);
                            String key = Arrays.deepToString(arr);
                            if (memory.add(key))
                                pos.offer(new Pair(arr, hurestic(arr) + temp.steps + 1, temp.steps + 1));
                            }
                        break;
                    }
                }
            }
        }
        return -1;
    }
}