class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        if (nums.length <= (k << 1) + 1) return nums.length;
        int ans = 0;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;;

        for(int num : nums){
            int val = Math.max(max+1 , num-k);
            if(val <= num+k){
                ans++;
                max = val;
            }
            
        }
        return ans;
    }
}