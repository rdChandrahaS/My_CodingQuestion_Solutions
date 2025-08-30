class Solution {
    public int sumOfUnique(int[] nums) {
        int[] loc = new int[101];
        int sum = 0;
        for(int a : nums)loc[a]++;
        for(int i = 0 ; i < 101 ; i++){
            if(loc[i]==1) sum+=i;
        }
        return sum;
    }
}