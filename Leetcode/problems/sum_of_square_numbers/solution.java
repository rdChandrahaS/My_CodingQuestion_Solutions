class Solution {

    public long sqrt(long c,long low,long high){
        if(low<high){
            long mid=low+(high-low)/2;
            if (mid*mid==c)return mid;
            else if(mid*mid > c)return sqrt(c,low,mid-1);
            else return sqrt(c,mid+1,high);
        }
        return low;
    }
    public boolean judgeSquareSum(int c) {
        long low=0,high=sqrt(c,0,c/2);
        if(c==0 || c==1 || c==2)return true;
        while(low<=high){
            long temp=low*low + high*high;
            if(temp==(long)c)return true;
            else if(temp > (long)c)high--;
            else low++;
        }
        return false;
    }
}