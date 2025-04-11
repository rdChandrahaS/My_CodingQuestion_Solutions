class Solution {
    public static int pos(int[] arr, int start,int end,int element){
        if(start>end){return start;}
        int mid=start+(end-start)/2;
        if(arr[mid]==element){return mid;}
        else if(element>arr[mid]){ return pos(arr,mid+1,end,element);}
        else{return pos(arr,start,mid-1,element);}}
    public int searchInsert(int[] nums, int target) {
        return pos(nums,0,nums.length-1,target);
    }
}