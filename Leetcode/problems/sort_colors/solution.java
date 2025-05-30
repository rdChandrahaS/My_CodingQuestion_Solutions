class Solution {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1,mid=0;
        while(mid<nums.length){
            if(nums[mid]==0 && mid>=low){
                nums[low]=nums[low]^nums[mid]^(nums[mid]=nums[low]);
                mid++;
                low++;
            }else if(nums[mid]==2 && mid<=high){
                nums[high]=nums[high]^nums[mid]^(nums[mid]=nums[high]);
                high--;
            }else mid++;
        }
    }
}