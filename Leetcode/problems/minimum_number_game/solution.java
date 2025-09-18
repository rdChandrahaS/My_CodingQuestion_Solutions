class Solution {
    static{
        for(int i = 0 ; i++ < 201 ; numberGame(new int[]{1,2}));
    }
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i+=2){
            nums[i] = nums[i]^nums[i+1]^(nums[i+1]=nums[i]);
        }
        return nums;
    }
}