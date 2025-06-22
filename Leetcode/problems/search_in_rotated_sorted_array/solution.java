class Solution {
    public int pivot(int[] nums,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid] > nums[nums.length-1])return pivot(nums,mid+1,high);
            else return pivot(nums,low,mid);
        }
        return low;
    }

    public int binarySearch(int[] nums,int low,int high,int target){
        if(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid] < target) return binarySearch(nums,mid+1,high,target);
            else return binarySearch(nums,low,mid-1,target);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int ind= pivot(nums,0,nums.length);
        if(ind==0)return binarySearch(nums,0,nums.length-1,target);
        else{
            if(target>= nums[ind] && target<= nums[nums.length-1])return binarySearch(nums,ind,nums.length-1,target);
            else return binarySearch(nums,0,ind,target);
        }
    }
}