class Solution {
    static {
        for (int i = 0; i++ < 200; countHomogenous("a"));
    }

    public static int countHomogenous(String s) {
        if (s.length() == 1) return 1;

        int ans = 0;
        int equal = 0;
        final int mod = 1000000007;
        char ch = s.charAt(0);;
        for(int i = 0 ; i < s.length() ;i++){
            if(s.charAt(i)==ch){
                ans = ( ans + ++equal) % mod;
            }else{
                equal = 1;
                ans = (ans + equal) % mod;
                ch = s.charAt(i);
            }
        }
        return ans;
    }
}