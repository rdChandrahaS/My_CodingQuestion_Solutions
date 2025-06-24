class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        char[] chs=s.toCharArray();
        Arrays.sort(chs);
        char[] cht=t.toCharArray();
        Arrays.sort(cht);
        for(int i=0;i<s.length();i++){
            if(chs[i]!=cht[i])return false;
        }
        return true;
    }
}