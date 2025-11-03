class Solution {
    public int minCost(String colors, int[] neededTime) {
        if(neededTime.length == 1) return 0;
        int prev = 0;
        int curr = 1;
        int ans = 0;
        while( curr < neededTime.length ){
            int sum = neededTime[prev];
            int max = sum;
            if(colors.charAt(prev) == colors.charAt(curr)){
                while(curr < neededTime.length && colors.charAt(prev) == colors.charAt(curr)){
                    sum += neededTime[curr];
                    max = Math.max(max,neededTime[curr]);
                    prev++;
                    curr++;
                }
                ans += sum - max;
            }else{
                prev++;
                curr++;
            }
        }
        return ans;
    }
}