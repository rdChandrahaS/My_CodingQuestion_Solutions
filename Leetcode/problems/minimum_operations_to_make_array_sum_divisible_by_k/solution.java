class Solution {
    // static{
    //     for(int i = 0 ; i++ < 201 ; minOperations(new int[]{1},1)){}
    // }
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        return sum%k;
    }
}