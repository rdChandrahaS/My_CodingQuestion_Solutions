class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        long k = (long)nums.length/3,ans=0;
        int i=1;
        while(k>0){
            ans+=nums[nums.length-2*i];
            k--;
            i++;
        }
        return ans;
    }
}