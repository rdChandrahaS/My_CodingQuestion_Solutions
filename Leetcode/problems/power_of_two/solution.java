class Solution {
    static{
        for(int i=0;i++<500;isPowerOfTwo(0));
    }
    public static boolean isPowerOfTwo(int n) {
        /**
        1
        10
        100
        1000
        10000
        100000
         */
        if (n==0) return false;
        int power = (int)(Math.log(n) / Math.log(2));
        return n == Math.pow(2,power);
    }
}