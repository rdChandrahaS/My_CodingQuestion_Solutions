class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low < high){
            while(low < nums.length && nums[low] % 2 == 0) low++;
            while(high > -1 && nums[high] % 2 != 0)high--;
            if(low < high)nums[low] = nums[low] ^ nums[high] ^ (nums[high] = nums[low]);
        }
        return nums;
    }
}