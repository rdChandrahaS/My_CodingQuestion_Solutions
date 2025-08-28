class Solution {
    public int maxFreqSum(String s) {
        int[] loc = new int[26];
        for(int i = 0 ; i < s.length() ; i++) loc[s.charAt(i)-'a']++;
        int vow = 0;
        int con = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20) vow = vow<loc[i]?loc[i]:vow;
            else con = con<loc[i]?loc[i]:con;
        }
        return vow+con;
    }
}