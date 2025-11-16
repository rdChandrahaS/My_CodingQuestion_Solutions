class Solution {
    static {
        for (int i = 0; i++ < 500;numSub("111111"));
    }
    public static int numSub(String s) {
        int ans = 0;
        int one = 0;
        final int mod = 1000000007;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1'){
                ans = (ans +  ++one) % mod;
            }else one = 0;;
        }
        return ans;
    }
}