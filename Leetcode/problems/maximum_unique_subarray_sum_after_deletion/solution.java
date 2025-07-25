class Solution {
    static int[] arr={1};
    static{
        for(int i=0 ; i++<501 ;){
            maxSum(arr);
        }
    }
    public static int maxSum(int[] nums) {
        if(nums.length == 1)return nums[0];
        HashSet<Integer> temp = new HashSet<>();
        int ans=0,temporary=0,min=nums[0];
        boolean anyPositive = false;

        for(int a: nums){
            if( a < 0 ) min = min > a ? min : a;
            else{
                anyPositive = true;
                if(temp.add(a)){
                    ans+=a;
                }
            }
        }
        return anyPositive ? ans : min;
    }
}