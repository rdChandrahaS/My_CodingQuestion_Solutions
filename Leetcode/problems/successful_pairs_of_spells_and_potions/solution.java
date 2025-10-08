class Solution {
    public int binary(int[] arr,int mul,long target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;

            long temp = (long)arr[mid]*mul;

            if(temp < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return low;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        int i = 0;
        int len = potions.length;
        for(int n : spells){
            if( (long)n*potions[len-1] < success){
                ans[i] = 0;
            }else ans[i] = len - binary(potions,n,success);
            i++;
        }
        return ans;
    }
}