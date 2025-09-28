class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        int b = 0;
        int c = 0;
        int len = nums.length;
        int i = 1;
        while(i <= (len-2)){
            c = nums[len-i];
            b = nums[len-i-1];
            a = nums[len-i-2];
            if((a+b)>c) return (a+b+c);
            else i++;
        }
        return 0;
    }
}