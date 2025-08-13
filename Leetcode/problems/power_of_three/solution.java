class Solution {
    // static{
    //     for(int i = 0 ; i++ < 500 ; isPowerOfThree(0)){}
    // }
    public static boolean isPowerOfThree(int n) {
        if(n<1)return false;
        while(n % 3 == 0){
            n/=3;
        }
        return n==1;
    }
}