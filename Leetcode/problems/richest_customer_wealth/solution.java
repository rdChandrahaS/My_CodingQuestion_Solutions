class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = -1;
        for(int[] a: accounts){
            int tempSum = 0;
            for(int x : a){
                tempSum += x;
            }
            ans = Math.max(ans,tempSum);
        }
        return ans;
    }
}