class Solution {
    public static int peak(int arr[],int low,int high){
        if(low<=high){
            int mid=low+(high-low)/2;

            if(low>-1 && high <arr.length && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])return mid;

            else if((low>-1 && high <arr.length) && arr[mid]<arr[mid-1])return peak(arr,low,high-1);

            else return peak(arr,mid+1,high);
        }
        return low;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        return peak(arr,0,arr.length-1);
    }
}