class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int a : nums){
            if(a%3 != 0) ans++;
        }
        return ans;
    }
}