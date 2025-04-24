class Solution {
    public boolean sqrt(long low,long high,long target){
        if(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid==target)return true;
            if(mid*mid > target)return sqrt(low,mid-1,target);
            else return sqrt(mid+1,high,target);
        }
        return false;
    }
    public boolean isPerfectSquare(int num) {
        if(num<10 && (num==0 || num==1 || num == 4))return true;
        else return sqrt(0,(long)(num/2),(long)num);
    }
}