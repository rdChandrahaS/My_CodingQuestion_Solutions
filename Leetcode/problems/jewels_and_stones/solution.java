class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] loc = new int[52];
        for(char ch : stones.toCharArray()){
            if(ch>='A' && ch<='Z') loc[ch-'A']++;
            else loc[ch-'a'+26]++;
        }
        int ans = 0;
        for(char ch : jewels.toCharArray()){
            if(ch>='A' && ch<='Z') ans += loc[ch-'A'];
            else ans += loc[ch-'a'+26];
        }
        return ans;
    }
}