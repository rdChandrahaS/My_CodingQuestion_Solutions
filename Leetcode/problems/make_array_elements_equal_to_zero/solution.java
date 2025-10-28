class Solution {
    int sum(int[] nums,int curr){
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0 ; i < curr ; i++){
            leftSum += nums[i];
        }
        for(int i = curr+1 ; i < nums.length ; i++){
            rightSum += nums[i];
        }
        int ans = 0;
        if(Math.abs(leftSum - rightSum)==1) ans = 1;
        else if(leftSum - rightSum == 0) ans = 2;
        else ans = 0;
        return ans;
    }
    
    public int countValidSelections(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                ans += sum(nums,i);
            }
        }
        return ans;
    }
}