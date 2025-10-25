class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int week = 1;
        int mon = week;
        for(int i = 0 ; i < n ; i++){
            sum += mon;
            mon++;
            if((i + 1) % 7 == 0){
                week++;
                mon = week;
            }
        }
        return sum;
    }
}