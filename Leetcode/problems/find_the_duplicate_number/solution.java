class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> temp = new HashSet<>();
        for(int a:nums){
            if(!temp.add(a))return a;
        }
        return nums[0];
    }
}