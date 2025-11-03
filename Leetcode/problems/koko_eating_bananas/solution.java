class Solution {
    int[] arr;
    private int maximum(int[] piles){
        int m = piles[0];
        for(int n : piles) m = Math.max(m,n);
        return m;
    }
    private boolean predicate(int n,int h){
        int max = 0;
        for(int i = 0 ; i < arr.length ;i++){
            max += Math.ceil((double) arr[i] / n);
        }
        return max <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high = maximum(piles);
        if(piles.length == h) return high;
        int low = 1;
        // int high = max;
        arr = piles;

        while(low < high){
            int mid = low + (high-low)/2;
            if(predicate(mid,h)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
/**
15
16 17 18 19 20 21 22 23 24 25 26 27 28 29 30

 */