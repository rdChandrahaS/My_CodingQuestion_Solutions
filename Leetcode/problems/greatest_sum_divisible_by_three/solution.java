class Solution {
    private boolean safe(int n) {return n != Integer.MAX_VALUE;}
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int min1a = Integer.MAX_VALUE;
        int min1b = Integer.MAX_VALUE;
        int min2a = Integer.MAX_VALUE;
        int min2b = Integer.MAX_VALUE;
        int rem = 0;

        for(int n : nums) {
            sum += n;
            rem = n % 3;

            if(rem == 1){
                if(min1a > n){
                    min1b = min1a;
                    min1a = n;
                }else{
                    min1b = Math.min(min1b,n);
                }
            }else if(rem == 2){
                if(min2a >= n){
                    min2b = min2a;
                    min2a = n;
                }else{
                    min2b = Math.min(min2b,n);
                }
            }
        }
        rem = sum % 3;

        if(rem == 1){
            if(safe(min1a) && safe(min2a) && safe(min2b)){
                int min2 = min2a + min2b;
                sum = sum - Math.min(min1a , min2);
            }
            else if(safe(min1a)){ 
                sum -= min1a;
            }else if(safe(min2a) && safe(min2b)){
                sum -= (min2a + min2b);
            }
        }else if(rem==2){
            if(safe(min2a) && safe(min1a) && safe(min1b)){
                int min1 = min1a + min1b;
                sum = sum - Math.min(min1 , min2a);
            }
            else if(safe(min2a)){ 
                sum -= min2a;
            }else if(safe(min1a) && safe(min1b)){
                sum -= (min1a + min1b);
            }
        }
        return sum%3==0?sum : 0;
    }
}