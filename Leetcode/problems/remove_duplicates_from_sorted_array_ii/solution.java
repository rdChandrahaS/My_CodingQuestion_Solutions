class Solution {
    public void leftshift(int[] arr,int index){
        int temp=arr[index];
        for(int i=index;i<arr.length-1;i++){arr[i]=arr[i+1];}
        arr[arr.length-1]=temp;
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){return nums.length;}
        int i=0,j,number_count=1,len=nums.length;
        while(i<len-1){
            j=i+1;
            number_count=1;
            while(j<len){
                if(nums[i]==nums[j] && number_count<2){number_count++;j++;}
                else if(nums[i]==nums[j] && number_count>=2){leftshift(nums,j);len--;}
                else{j++;}
            }
            i++;
        }
        return len;
    }
}