class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length,i=0;
        while(i<len){
            if(nums[i]==0){
                for(int j=i;j<len-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[len-- - 1]=0;
            }
            if(nums[i]!=0){i++;}
        }
    }
}