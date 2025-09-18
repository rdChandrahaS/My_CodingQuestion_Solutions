class Solution {
    //List<List<Integer>> ans = new ArrayList<>(); 
    HashSet<List<Integer>> ans = new HashSet<>();
    public void recursion(int[] nums,int index,List<Integer> list) { 
        if(index >= nums.length){ 
            ans.add(new ArrayList<>(list)); 
            return; 
        }else{ 
            list.add(nums[index]); 
            recursion(nums , index+1 ,list); 
            list.remove(list.size()-1); 
            recursion(nums , index+1, list); 
        } 
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        recursion(nums,0,new ArrayList<>());
        List<List<Integer>> answer = new ArrayList<>();
        for(List<Integer> a : ans) answer.add(a);
        return answer;
    }
}