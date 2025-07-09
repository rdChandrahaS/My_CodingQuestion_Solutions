class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int h_right=matrix[0].length,v_down=matrix.length;
        int h_left=0, v_up=0;
        int row=0,col=0,max=matrix.length*matrix[0].length;
        while(ans.size() < max){
            while(ans.size() < max && row < h_right) {
                ans.add(matrix[col][row]);
                row++;}
            row-=1;
            col+=1;
            v_up+=1;
            while(ans.size() < max && col < v_down){
                ans.add(matrix[col][row]);
                col++;}
            col-=1;
            row-=1;
            h_right-=1;
            while(ans.size() < max && row >= h_left){
                ans.add(matrix[col][row]);
                row--;}
            row+=1;
            col-=1;
            v_down-=1;
            while(ans.size() < max && col >= v_up){
                ans.add(matrix[col][row]);
                col--;}
            col+=1;
            row+=1;
            h_left+=1;
        }
        return ans;
    }
}