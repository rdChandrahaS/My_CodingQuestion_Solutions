class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low=0,high=nums.length-1,i;
        HashSet<Integer> temp = new HashSet<>();
        for(int a:nums)temp.add(a);
        for(i=0;i<nums.length;i++){
            if(temp.contains(target-nums[i])){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==(target-nums[i])) return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
}