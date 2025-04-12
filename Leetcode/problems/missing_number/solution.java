class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i =0,missing_elm=0;i<nums.length;i++,missing_elm++){
            if(missing_elm != nums[i]){return missing_elm;}
        }
        return nums[nums.length-1]+1;
    }
}