class Solution {
    public int climbStairs(int n) {
        if(n<=1)return 1;
        if(n==2)return 2;
        int a=1,b=2,c=a+b;
        while(n>=3){
            c=a+b;
            a=b;
            b=c;
            n--;
        }
        return c;
    }
}