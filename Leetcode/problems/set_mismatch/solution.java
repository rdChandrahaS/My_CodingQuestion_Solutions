class Solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        int[] loc = new int[len + 1];
        int duplicate = 0;
        int totalSum = 0;
        for(int i : nums){
            totalSum += i;
            loc[i]++;
            if(loc[i]==2) {
                duplicate = i;
            }
        }
        int actualSum = (len * (len + 1)) / 2;

        return new int[]{duplicate , actualSum - totalSum + duplicate};
    }
}

/**
[duplicate , missing]

actualSum + duplicate = totalSum + missing

missing = actualSum - totalSum + duplicate

1   2   2   4   //3
1   2   3   4   //2

 */