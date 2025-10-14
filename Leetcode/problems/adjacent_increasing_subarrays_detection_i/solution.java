class Solution {
    public boolean isIncreasing(List<Integer> nums,int k,int start){
        if(start > nums.size() || start + k > nums.size()) return false;
        for(int i = start+1 ; i < start+k ; i++){
            if(nums.get(i-1) >= nums.get(i)) return false;
        }
        return true;
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for(int i = 0 ; i < nums.size() ; i++){
            if(isIncreasing(nums,k,i)){
                if(isIncreasing(nums,k,k+i)){
                    return true;
                }
            }
        }
        return false;
    }
}