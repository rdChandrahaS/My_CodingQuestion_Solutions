class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1)return nums[0];
        int low = 0;
        int high = nums.length;
        int i = 1;

        do{
            nums[i-1] = (nums[i-1] + nums[i])%10;
            i++;
            if(i==high){
                high--;
                i=1;
            }
        }while(i<high && low<high);
        return nums[0];
    }
}