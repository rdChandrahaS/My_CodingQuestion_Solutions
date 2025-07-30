class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int start = 0;
        int end = 0;
        int count = 0;
        int temp = 0;
        for(int a:nums) max = max > a ? max : a;
        while(end < nums.length){
            if(nums[end] == max){
                end++;
                temp++;
            }else{
                start++;
                end++;
                temp=0;
            }
            count = Math.max(count,temp);
        }
        return count;
    }
}