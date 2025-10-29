class Solution {
    public int smallestNumber(int n) {
        // int ans = 0;
        // int div = 0;
        // int rem = n;
        // while(rem > 0){
        //     rem = n >> div;
        //     ans = 1 << div;
        //     div++;
        // }
        // return ans - 1;
        while((n & (n + 1)) != 0) n++;
        return n;
    }
}

/*
1   0   0
1   0   1
1   1   0
x       :   0   1   1   1
x + 1   :   1   0   0   0
*/