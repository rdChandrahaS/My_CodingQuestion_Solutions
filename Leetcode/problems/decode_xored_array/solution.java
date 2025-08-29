class Solution {
    static{
        for(int i = 0 ; i++ < 100 ; decode(new int[]{1},1)){}
    }
    public static int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        ans[0]=first;
        for(int i = 1 ; i < ans.length ; i++){
            ans[i] = ans[i-1]^encoded[i-1];
        }
        return ans;
    }
}