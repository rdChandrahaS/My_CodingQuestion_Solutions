class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int small=0,count=0;
        for(int i:nums){
            if(i==target)count++;
            if(i<target)small++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<count;i++){
            ans.add(small+i);
        }
        return ans;
    }
}