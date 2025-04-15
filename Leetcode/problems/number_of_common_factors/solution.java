class Solution {
    public int commonFactors(int a, int b) {
        int n=a>b?b:a;
        int c=((a+b)-n)%n==0?1:0;
        for(int i=1;i<n/2+1;i++){
            if(a%i==0 && b%i==0){c++;}
        }
        return c;
    }
}