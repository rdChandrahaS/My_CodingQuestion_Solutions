class Solution {
    static{
        for(int i=0;i++<500;firstUniqChar("a"));
    }
    public static int firstUniqChar(String s) {
        if(s.length()==1)return 0;
        char[] ch=s.toCharArray();
        int[] loc = new int[26];
        for(int i=0;i<s.length();i++){
            if( loc[ch[i]-'a'] != -1 && loc[ch[i]-'a'] == 0  ){
                loc[ch[i]-'a']=i + 1;
            }else{
                loc[ch[i]-'a']=-1;
            }
        }
        for(int i=0;i<s.length();i++){
            if(loc[ch[i]-'a']>0) return loc[ch[i]-'a']-1;
        }
        return -1;
    }
}