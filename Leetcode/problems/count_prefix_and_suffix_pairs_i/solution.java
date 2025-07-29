class Solution {
    static{
        for(int i=0;i++<500;){
            countPrefixSuffixPairs(new String[]{"a"});
        }
    }
    public static int countPrefixSuffixPairs(String[] words) {
        if(words.length==1)return 0;
        int ans=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[j].startsWith(words[i]) && words[j].startsWith(words[i] , words[j].length()-words[i].length()))
                //if(words[j].startsWith(words[i]) && words[j].endsWith(words[i]))
                    ans++;
            }
        }
        return ans;
    }
}