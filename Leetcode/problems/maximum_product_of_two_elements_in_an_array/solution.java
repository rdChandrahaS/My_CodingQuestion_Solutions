class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int secondMax = -1;
        for(int a : nums){
            if(a >= max) {
                secondMax = max;
                max = a;
            }else if(a > secondMax) secondMax = a;
        }
        return (max-1)*(secondMax-1);
    }
}