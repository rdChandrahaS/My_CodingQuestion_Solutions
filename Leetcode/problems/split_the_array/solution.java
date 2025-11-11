class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] loc = new int[101];
        for(int i : nums)loc[i]++;
        int one = 0;
        for(int i : loc){
            if(i==0 || i==2) continue;
            else if(i == 1) one++;
            else return false;
        }
        return one % 2 == 0;
    }
}