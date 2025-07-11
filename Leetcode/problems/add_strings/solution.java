class Solution {
    public char sum(int a, int b, int c) {
        return (char)((a + b + c) % 10 + '0');
    }

    public int carry(int a,int b,int c){
        return (a+b+c)/10;
    }

    public String addStrings(String num1, String num2) {
        char[] top = num1.toCharArray();
        char[] bottom = num2.toCharArray();
        char[] ans = new char[1 + Math.max(num1.length(), num2.length())];
        ans[0]='a';

        int t=top.length-1,b=bottom.length-1,c=0;

        for(int i=ans.length-1;i>=0;i--){
            ans[i]=sum( t<0?0:top[t]-'0' , b<0?0:bottom[b]-'0' , c );
            c=carry( t<0?0:top[t]-'0' , b<0?0:bottom[b]-'0' , c );
            t--;
            b--;
        }
        
        return ans[0]=='a'|| ans[0]=='0'?new String(ans,1,ans.length-1): new String(ans);
    }
}