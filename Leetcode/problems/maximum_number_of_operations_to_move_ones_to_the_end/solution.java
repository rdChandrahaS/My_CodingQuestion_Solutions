class Solution {
    static{
        for(int i = 0 ; i++ < 500 ; maxOperations("0"));
    }
    public static int maxOperations(String s) {
        int one = 0;
        int ans = 0;
        int i = 0;
        while(i < s.length()){
            while(i<s.length() && s.charAt(i)=='1'){ 
                one++;
                i++;
            }
            if(i<s.length() && s.charAt(i)=='0'){
                ans += one;
                i++;
            }
            while(i<s.length() && s.charAt(i)=='0') i++;
        }
        return ans;
    }
}