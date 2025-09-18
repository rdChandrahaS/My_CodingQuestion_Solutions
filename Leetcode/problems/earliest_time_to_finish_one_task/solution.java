class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = Integer.MAX_VALUE;
        for(int[] a : tasks){
            int temp = a[0] + a[1];
            ans = temp < ans ? temp : ans;
        }
        return ans;
    }
}