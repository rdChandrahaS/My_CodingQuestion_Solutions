class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length==2)return new int[]{1,2};
        int i=numbers.length-1,j=0;
        while(j<i){
            if(i>j && numbers[i]+numbers[j]==target)return new int[]{j+1,i+1};
            else if(numbers[i]+numbers[j]<target)j++;
            else i--;
        }
        return new int[]{i,j};
    }
}