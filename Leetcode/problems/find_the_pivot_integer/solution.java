class Solution {
    public int pivotInteger(int n) {
        int low = 1;
        int high = n;
        int left = 1;
        int right = n;
        while(low <= high){
            if(low==high && left==right) return low;
            if(left < right) {
                low++;
                left += low;
            }else{
                high--;
                right += high;
            }
        }
        return -1;
    }
}