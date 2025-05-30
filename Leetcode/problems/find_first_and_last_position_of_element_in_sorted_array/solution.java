class Solution {
    private static int[] ans(int nums[],int target,int low,int high){
        if(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                int a=mid,b=mid;
                while(a>0 && nums[mid]==nums[a-1])a--;
                while(b<nums.length-1 && nums[mid]==nums[b+1])b++;
                return new int[]{a,b};
            }else if(nums[mid] < target)return ans(nums,target,mid+1,high);
            else return ans(nums,target,low,mid-1);
        }else return new int[]{-1,-1};
    }
    public int[] searchRange(int[] nums, int target) {
        return nums.length<1?new int[]{-1,-1}:ans(nums,target,0,nums.length-1);
    }
}