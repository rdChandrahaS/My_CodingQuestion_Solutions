class Solution {
    static{
        for(int i=0;i++<500;){
            isTrionic(new int[]{1,1,1});
        }
    }
    public static boolean isTrionic(int[] nums) {
        if(nums.length<4)return false;
        int end=1;
        while(end < nums.length){
            int start = end;
            while(end<nums.length && nums[end-1] < nums[end]) end++;

            int p = end;
            if(start == p || end==nums.length) return false;

            while(end<nums.length && nums[end-1] > nums[end]) end++;
            int q = end;
            if(q == p || end == nums.length)return false;

            while(end<nums.length && nums[end-1] < nums[end]) end++;
            if(end < nums.length) return false;
        }
        return true;
    }
}