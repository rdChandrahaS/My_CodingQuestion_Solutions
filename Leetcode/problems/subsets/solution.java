class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void recursion(int[] nums,int index,List<Integer> list) {
        if(index >= nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }else{
            //List<Integer> temp = new ArrayList<>();
            list.add(nums[index]);
            recursion(nums , index+1 ,list);
            list.remove(list.size()-1);
            recursion(nums , index+1, list);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        recursion(nums,0,new ArrayList<Integer>());
        return ans;
    }
}