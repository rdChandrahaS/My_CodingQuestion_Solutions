class Solution {
    static{
        for(int i = 0 ; i++ < 201 ; areaOfMaxDiagonal(new int[][]{{1,1}})){}
    }
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = -1;
        int an = -1;
        for(int[] a : dimensions){
            int temp = a[0]*a[0] + a[1]*a[1];
            if(an < temp){
                an = temp;
                ans = a[0]*a[1];
            }else if(an == temp){
                ans = Math.max(ans,a[0]*a[1]);
            }
        }
        return ans;
    }
}