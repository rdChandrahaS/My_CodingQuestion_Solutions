class Solution {
    public int trailingZeroes(int n) {
        int div=5,sum=0;
        while(n/div>0){
            sum+=n/div;
            div*=5;
        }
        return sum;
    }
}