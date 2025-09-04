class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] mf = new boolean[n];
        for(int i = 2 ; i < n ; i++){
            if(!mf[i]){
                count++;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        mf[j] = true;
                    }
                }
            }
        }
        return count;
    }
}