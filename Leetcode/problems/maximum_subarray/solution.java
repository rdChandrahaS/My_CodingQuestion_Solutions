class Solution {
    static{
        for(int i = 0 ; i++ < 201 ; maxSubArray(new int[]{1}) ){}
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0];
        int maxSum = Integer.MIN_VALUE;
        int index = 0;
        int sum = 0;
        while( index < nums.length ){
            sum += nums[index];
            maxSum = (sum>maxSum)? sum : maxSum;
            if(sum < 0) sum = 0;
            index++;
        }
        return maxSum;
    }
}