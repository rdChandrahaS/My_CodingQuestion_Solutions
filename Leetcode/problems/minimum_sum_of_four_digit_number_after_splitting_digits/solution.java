class Solution {
    public int minimumSum(int nums) {
        int[] num = new int[4];
        int i = 3;
        while(nums > 0) {
            num[i--] = nums % 10;
            nums /= 10;
        }
        Arrays.sort(num);
        return ((num[0]*10) + num[2]) + ((num[1]*10) + num[3]);
    }
}