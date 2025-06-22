class Solution {
    public String[] divideString(String s, int k, char fill) {
        for(int i=0;i<s.length()%k;i++)s+=String.valueOf(fill);
        String[] ans=new String[s.length()/k];

        for(int i=0,j=0;i<ans.length;i++,j+=k){
            ans[i]=s.substring(j,j+k);
        }
        return ans;
    }
}