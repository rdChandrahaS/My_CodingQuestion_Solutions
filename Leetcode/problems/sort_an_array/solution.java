class Solution {
    public void mergeSort(int[] nums,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
    public void merge(int[] nums,int low,int mid,int high){
        int as1=mid-low+1,as2=high-mid,i=0,j=0,size=low;
        int[] arr1=new int[as1],arr2=new int[as2];
        for(int a=0;a<as1;a++)arr1[a]=nums[low+a];
        for(int a=0;a<as2;a++)arr2[a]=nums[mid+1+a];
        while(i<as1 && j<as2){
            if(i<as1 && j<as2 && arr1[i] <= arr2[j])nums[size++]=arr1[i++];
            if(i<as1 && j<as2 && arr1[i] > arr2[j])nums[size++]=arr2[j++];
        }
        while(i<as1)nums[size++]=arr1[i++];
        while(j<as2)nums[size++]=arr2[j++];
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);

        return nums;
    }
}