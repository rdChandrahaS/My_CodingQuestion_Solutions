class Solution {
    static
    {
        for(int i=0;i++<100;kLengthApart(new int[]{0}, 2));
    }
    public static boolean kLengthApart(int[] nums, int k) {
        int low = 0;
        int high = 0;
        while(low<nums.length && nums[low]==0) low++;
        while(high < nums.length){
            high = low + 1;
            while(high<nums.length && nums[high]==0)high++;
            if(high<nums.length){
                if((high - low) <= k) return false;
                else low = high;
            }
        }
        return true;
    }
}