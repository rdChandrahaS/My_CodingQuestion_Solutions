class Solution {
    public int[] shuffle(int[] nums, int n) {
            var temp1 = new int[n];
            var temp2 = new int[n];
        for(int i = 0 ; i < n ; i++){ 
            temp1[i] = nums[i];
            temp2[i] = nums[i+n];
        }    
        for(int i = 0 ; i < n ; i++){
            nums[i*2] = temp1[i];
            nums[2*i + 1] = temp2[i];
        }
        return nums;
    }
}