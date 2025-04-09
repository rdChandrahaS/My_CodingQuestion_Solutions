class Solution {
    public static String answer(String s1,String s2){
        //int n=(s1.length() < s2.length())?s1.length():s2.length() ;
        int c=0,n;
        String ans="";
        n= Math.min(s1.length(),s2.length());
        if(s1.length() != 0 && s2.length()!=0){
            for(int i=1;i<=n;i++){
                String sub=s1.substring(0,i);
                if(s2.startsWith(sub)){
                    ans = sub;
                }
            }
            return ans;
        }
        else
            return "";
    }
    public String longestCommonPrefix(String[] strs){
        String st=strs[0],ans="";
        if(strs.length > 1){
            for(int i=0;i<strs.length;i++){
                ans=answer(st,strs[i]);
                st=ans;
            }
            return st;
        }
        else
            return strs[0];
    }
}