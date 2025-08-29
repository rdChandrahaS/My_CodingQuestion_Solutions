class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        for(int a : nums){
            if(a < k) ans++;
        }
        return ans;
    }
}