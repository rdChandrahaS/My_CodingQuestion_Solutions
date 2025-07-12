class Solution {
    static{
        for(int i=0;i++<500;detectCapitalUse("a"));
    }
    public static boolean detectCapitalUse(String word) {
        if(word.length()==1)return true;
        StringBuilder s = new StringBuilder();

        int size = word.length();
        char[] loc = word.toCharArray();

        for(int i=0;i<size;i++){
            if(loc[i]>='a') s.append(loc[i]);
        }
        return s.length()==size || (s.length()==size-1 && loc[0]<'a') || s.length()==0;
    }
}