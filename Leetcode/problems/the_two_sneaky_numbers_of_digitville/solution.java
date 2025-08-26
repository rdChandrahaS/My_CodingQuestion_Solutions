class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] loc = new int[103];
        int size = 0;
        for(int a : nums){
            size = loc[a] > 0 ? size+1 : size; 
            loc[a]++;
        }
        var ans = new int[size];
        int index = 0;
        for(int a = 0 ; a < 103 ; a++){
            if(loc[a] > 1) ans[index++] = a;
        }
        return ans;
    }
}