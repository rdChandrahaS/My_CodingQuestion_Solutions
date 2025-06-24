class Solution {
    public int tribonacci(int n) {
        if(n==0)return 0;
        else if(n==1)return 1;
        else if(n==2)return 1;
        else{
            int a=0,b=1,c=1,ans=a+b+c;
            while(n>=3){
                ans=a+b+c;
                a=b;
                b=c;
                c=ans;
                n--;
            }
            return ans;
        }
    }
}