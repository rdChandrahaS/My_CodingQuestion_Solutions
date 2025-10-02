class Solution {
    static{
        for(int i = 0 ; i++ < 500 ; maxBottlesDrunk(1,1)){}
    }
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty = 0;
        int remaining = 0;
        int ans = 0;
        while(numBottles != 0){
            ans += numBottles;

            empty = numBottles + remaining;

            //Exchange
            int exchange = 0;
            while(empty >= numExchange){
                exchange++;
                empty -= numExchange;
                numExchange++;
            }
            remaining = empty;
            numBottles = exchange;
        }
        return ans;
    }
}