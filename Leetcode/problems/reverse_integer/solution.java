class Solution {
    public int reverse(int x) {
        int sign = x<0?-1:1;
        x=Math.abs(x);
        long newnum=0,rem;
        while(x>0){
            rem=(long)(x%10);
            newnum=newnum*10+rem;
            x/=10;
        }
        return (newnum>Integer.MAX_VALUE || newnum<Integer.MIN_VALUE) ?0: (int)((sign==-1)?-1*newnum:newnum);
    }
}