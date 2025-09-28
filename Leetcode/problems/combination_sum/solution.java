class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void backtrack(int[] loc,int target,List<Integer> temp,int index){
        if(index >= loc.length){
            return;
        }else if(target < 0){ 
            return;
        }else if(target==0){
            ans.add(new ArrayList(temp));   
        }else{
            temp.add(loc[index]);
            backtrack(loc,target-loc[index],temp,index);
            temp.remove(temp.size()-1);
            backtrack(loc,target,temp,index+1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates,target,new ArrayList<>(),0);
        return ans;
    }
}