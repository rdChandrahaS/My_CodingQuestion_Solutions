class Solution {
    public int arr(int n){
        if(n==1) return 10;
        int first = 9;
        int changableDigit = 9;

        // because first digit cannot be 0, so 9 choices, then from 2nd digit, there are 10-1 = 9 choice and from 3rd digit, there are 8 possibilities and so on.
        for(int i = 2 ; i <= n ; i++){
            first *= changableDigit;
            changableDigit--;
        }
        return first;
    }
    
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)return 1;
        int ans = 0;
        for(int i = 1 ; i <= n ; i++){
            ans += arr(i);
        }
        return ans;
    }
}