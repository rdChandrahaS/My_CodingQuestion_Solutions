class Solution {
    public int min(int[] nums,int low,int high){
        if(low<=high){
            int mid=low+(high-low)/2;
            if(mid==0 && nums[mid]<nums[high])return nums[mid];
            else if(mid>0 && nums[mid]<nums[high] && nums[mid-1]>nums[mid])return nums[mid];
            else if(nums[mid]>nums[high])return min(nums,mid+1,high);
            else if(mid>0 && nums[mid]<nums[high] && nums[mid]>nums[mid-1])return min(nums,low,mid);
        }
        return nums[low];
    }
    public int findMin(int[] nums) {
        return (nums.length==0)?0:(nums.length==1)?nums[0]:min(nums,0,nums.length-1);
    }
}