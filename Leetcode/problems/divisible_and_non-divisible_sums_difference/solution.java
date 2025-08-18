class Solution {
    public int differenceOfSums(int n, int m) {
        int total_sum = n*(n+1)/2;
        int divisible = 0;
        for(int i = m ; i <=  n ; i+=m) divisible += i;
        int not_divisible = total_sum - divisible;
        return not_divisible-divisible;
    }
}