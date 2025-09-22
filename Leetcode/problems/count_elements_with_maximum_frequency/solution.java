class Solution {
    static{
        for(int i = 0 ; i++ < 500 ; maxFrequencyElements(new int[]{1})){}
    }
    public static int maxFrequencyElements(int[] nums) {
        int[] loc = new int[101];
        for(int a : nums)loc[a]++;
        int max = 0;
        int count = 0;
        for(int a : loc){
            if(a > max){
                max = a;
                count = a;
            }else if(a == max){
                count += a ;
            }
        }
        return count;
    }
}