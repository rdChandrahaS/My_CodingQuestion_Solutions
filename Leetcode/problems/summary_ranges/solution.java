class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length < 1)return new ArrayList<>();
        int num = nums[0];
        int end = 0;
        int len = nums.length;
        List<String> ans = new ArrayList<>();
        while(end < len){
            boolean flag = false;
            StringBuilder sb = new StringBuilder(String.valueOf(nums[end]));
            end+=1;
            num+=1;
            if(end < len && nums[end] == num){
                while(end < len && nums[end] == num){
                    end+=1;
                    num+=1;
                    flag = true;
                }
            }
            if(flag){sb.append("->").append(String.valueOf(nums[end-1]));}
            ans.add(sb.toString());
            if(end<len)num = nums[end];
        }
        return ans;
    }
}