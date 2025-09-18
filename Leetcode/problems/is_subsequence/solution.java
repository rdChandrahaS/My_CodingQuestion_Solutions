class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())return false;
        int jjj = 0;
        int count = 0;
        for(int ss = 0 ; ss < s.length() ; ss++){
            for(int tt = jjj ; tt < t.length() ; tt++){
                if(s.charAt(ss) == t.charAt(tt)){
                    count++;
                    jjj = tt+1;
                    break;
                }
            }
        }
        return count == s.length();
    }
}