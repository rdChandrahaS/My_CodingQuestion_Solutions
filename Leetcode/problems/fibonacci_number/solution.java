
class Solution {
    public static int fib(int n) {
        if(n==0)return 0;
        else if(n<=2)return 1;
        else {
            int a=0,b=1,c=a+b;
            while(n>=2){
                c=a+b;
                a=b;
                b=c;
                n--;
            }
            return c;
        }

    }
}