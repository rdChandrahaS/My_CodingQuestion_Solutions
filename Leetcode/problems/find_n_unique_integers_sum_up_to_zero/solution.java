class Solution {
    public int[] sumZero(int n) {
        int mid = n/2;
        int num = mid;
        var ans = new int[n];
        for(int i = 0 ; i < mid ; i++){
            ans[i] = -num;
            ans[n-1-i] = num;
            num--;
        }
        return ans;
    }
}