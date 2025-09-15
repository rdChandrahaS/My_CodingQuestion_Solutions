class Solution {
    int[] loc = new int[26];
    private boolean isValid(String s){
            for(char ch : s.toCharArray()){
                if(loc[ch-'a']>0) return false;
            }
            return true;
        }
    public int canBeTypedWords(String text, String brokenLetters) {
        for(char ch : brokenLetters.toCharArray()) loc[ch-'a']++;
        int ans = 0;
        for(String str : text.split(" ")){
            if(isValid(str)) ans++;
        }
        return ans;
    }
}