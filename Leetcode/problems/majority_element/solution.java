class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)return nums[0];
        int count = 1 , element = nums[0] , len = nums.length;
        int i=1;
        while(i < len){
            if( element == nums[i] ) count++;
            else count--;
            if(count < 0) {
                element = nums[i];
                count++;
            }
            i++;
        }
        return element;
    }
}