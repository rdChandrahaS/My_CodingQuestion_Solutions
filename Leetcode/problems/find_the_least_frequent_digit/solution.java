class Solution {
    public int getLeastFrequentDigit(int n) {
        if(n<10) return n;
        int[] loc = new int[10];
        while(n>0){
            int rem =n%10;
            loc[rem]++;
            n = n/10;
        }
        int min = Integer.MAX_VALUE;
        for(int a : loc){
            if(a>0)min = Math.min(min,a);
        }
        int ans = 0;
        for(int i = 0 ; i < 10 ; i ++){
            if(loc[i]==min){
                ans = i;
                break;
            }
        }
        return ans;
    }
}