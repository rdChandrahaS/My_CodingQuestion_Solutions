class Solution {
    public int removeElement(int[] nums, int val) {
        int i,j,c=0,len=nums.length;
        for(i=0;i<len;i++){
            if(val==nums[i]){c++;}}
        for(i=0;i<len;i++){
            for(j=len-1;j>=0;j--){
                if(val != nums[j]){break;}
            }
            if(val == nums[i] && i<j){
                    nums[i]=(nums[i] + nums[j])-(nums[j]=nums[i]);
                }
        }
        return (len-c);
    }
}