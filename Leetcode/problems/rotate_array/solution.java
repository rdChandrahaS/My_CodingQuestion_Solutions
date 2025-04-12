class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){return ;}
        int[] temp=new int[nums.length];
        if(nums.length<k){rotate(nums,k-nums.length);}
        else {
            for(int i=0;i<nums.length;i++){temp[i]=nums[i];}
        //Copying first k elements
            for(int i=0;i<nums.length-k;i++){
                nums[i+k]=temp[i];}
        //copying last k elements
            for(int i=0;i<k;i++){
                nums[i]=temp[nums.length-k+i];}}
    }
}