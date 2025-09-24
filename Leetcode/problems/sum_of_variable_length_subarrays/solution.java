class Solution {
    public int sum(int[] arr,int start,int end){
        int sum = 0;
        for(int i = start ; i <= end ; i++){
            sum += arr[i];
        }
        return sum;
    }
    public int subarraySum(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            ans += sum(nums,Math.max(0,i-nums[i]),i);
        }
        return ans;
    }
}