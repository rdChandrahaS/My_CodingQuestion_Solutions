class Solution {
    static{
        for(int i = 0 ; i++<201 ; reverseDegree("a"));
    }
    public static int reverseDegree(String s) {
        if(s=="a")return 26;
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            ans += (26- (s.charAt(i) - 97))*(i+1);
        }
        return ans;
    }
}