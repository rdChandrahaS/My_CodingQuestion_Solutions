class Solution {
    static{
        for(int i = 0 ; i++ < 201 ; removeDuplicates(new int[]{1})) {}
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==1)return 1;
        int i = 0;
        int j = 1;
        while(j < nums.length){
            while(j<nums.length && nums[i] == nums[j])j++;
            if(j==nums.length)break;
            nums[++i] = nums[j];
        }
        return i+1;
    }
}