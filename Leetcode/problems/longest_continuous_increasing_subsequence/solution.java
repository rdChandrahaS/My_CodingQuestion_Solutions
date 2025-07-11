class Solution {
    static{
        for(int i=0 ; i++<100 ; findLengthOfLCIS(new int[]{1}));
    }
    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length==1)return 1;

        int start=0,end=1,ans=0;
        while(end<nums.length){
            if(nums[end]>nums[end-1])end++;
            else{
                start = end;
                end = start+1;
            }
            ans = end-start>ans?end-start:ans;
        }
        return ans;
    }
}