class Solution {
    public boolean valid(int n){
        while(n>0){
            int rem = n%10;
            if(rem==0)return false;
            n /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i = 1 ; i <= n/2 ; i++){
            if(valid(i) && valid(n-i)){
                return new int[]{i,n-i};
            }
        }
        return new int[]{-1,-1};
    }
}