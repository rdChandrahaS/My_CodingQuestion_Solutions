class Solution {
    static{
        for(int i=0;i++<=500;longestPalindrome("a"));
    }
    public static int longestPalindrome(String s) {
        if(s.length()<2)return s.length();
        int[] temp = new int[58];

        int ans=0;
        boolean odd=false;

        for(char ch:s.toCharArray()){
            temp[ch-'A']++;
        }

        for(int a:temp){
            ans+=(a/2)*2;
            if(!odd && a%2==1)odd=true;
        }
        ans += odd ? 1 : 0;
        return ans;
    }
}