class Solution {
    public int findCenter(int[][] edges) {
        int possibility1 = edges[0][0];
        int possibility2 = edges[0][1];
        for(int i = 1 ; i < edges.length ; i++){
            if(possibility1 != edges[i][0] && possibility1 != edges[i][1]){
                possibility1 = -1;
            }
            if(possibility2 != edges[i][0] && possibility2 != edges[i][1]){
                possibility2 = -1;
            }
            if(possibility1==-1 || possibility2==-1) break;
        }
        return possibility1 + possibility2 + 1;
    }
}