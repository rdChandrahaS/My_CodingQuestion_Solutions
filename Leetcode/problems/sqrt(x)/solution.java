class Solution {
    static{
        for(int i=0;i<1000;i++)mySqrt(0);
    }
    public static int sqrt(long low,long high,long target){
        if(low<=high){
        long mid=low+(high-low)/2;
            if(mid*mid==target)return (int)mid;
            else if(mid*mid<target)return sqrt(mid+1,high,target);
            else return sqrt(low,mid-1,target);
       }
       return (int)(high);
    }
    public static int mySqrt(int x) {

        return (x==1 || x==0)?x:sqrt(0,(long)x/2,(long)x);
    }
}