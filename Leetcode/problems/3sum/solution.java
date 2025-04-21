class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int i=0,j,k,target;
        while(i<nums.length-2){
            target=nums[i];
            if(i>0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            j=i+1;
            k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==-target){
                    List<Integer> temp = new ArrayList<>();
                    temp.addAll(Arrays.asList(target,nums[j],nums[k]));
                    ans.add(temp);
                    while(j<k && nums[j]==nums[j+1])j++;
                    while(j<k && nums[k]==nums[k-1])k--;
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k] > -target)k--;
                else j++;

            }
            i++;
        }
        return ans;
    }
}