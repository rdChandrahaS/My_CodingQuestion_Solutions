class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int len = nums.length;
        while( end < len ){
            while(end < len && nums[end] == 0)end++;
            start = end;

            while( end < len && nums[end] == 1 ){
                end++;
            }
            ans = Math.max(ans,end-start);
        }
        return ans;
    }
}