class Solution {
    public long nCr(long n,long r){
        if(n==r || r==0) return 1;
        else if(r==1) return n;
        else return (nCr(n, r - 1) * (n - r + 1)) / r;
        /*
            nCr = nCr-1 * n-r+1/r

        */
    }
    public List<Integer> getRow(int rowIndex) {
        int[] loc = new int[rowIndex+1];
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i <= rowIndex ; i++){
            if(loc[i]==0){
                loc[i] = loc[rowIndex-i] = (int)nCr(rowIndex,i);
            }
            ans.add(loc[i]);
        }
        return ans;
    }
}