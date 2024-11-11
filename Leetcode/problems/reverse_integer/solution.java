class Solution {
    public int reverse(int x) {
        int n,lastDigit,newNum1;
        long newNum=0,limit = 2^31;
        if(x<0)
            n=x*(-1);
        else
            n=x;
        while(n!=0){
            lastDigit=n%10;
            newNum=newNum*10+lastDigit;
            n=n/10;
        }

        if ((newNum <= Integer.MAX_VALUE) && (newNum >= Integer.MIN_VALUE)) {
            newNum1 = (int)newNum;
            if(x<0)
            return newNum1*(-1);
            else if(x==0)
            return 0;
            else
            return newNum1;
        }
        else
        return 0;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();
        int ans = ob.reverse(n);
        System.out.println(ans);
    }
}