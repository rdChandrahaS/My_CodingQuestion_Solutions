class Solution {
    static{
        for(int i = 0 ; i++ < 201 ; zeroFilledSubarray(new int[]{0}));
    }
    // public long pmt(long n){
    //     return n*(n+1)/2;
    // }
    // public long zeroFilledSubarray(int[] nums) {
    //     long ans=0;
    //     int p1 = 0 , p2 = 0;
    //     int i = 0;
    //     while( i < nums.length ){
    //         if(nums[i]==0){
    //             p1 = i;
    //             p2 = i;
    //             do{
    //                 p2++;
    //             }while(p2<nums.length && nums[p2]==0);
    //             ans += pmt((long)(p2-p1));
    //             i = p2;
    //         }
    //         i++;
    //     }
    //     return ans;
    public static long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long ans = 0;
        for(int num : nums){
            if(num == 0){
                count += 1;
                ans += count;
            }else count = 0;
        }
        return ans;
    }
}