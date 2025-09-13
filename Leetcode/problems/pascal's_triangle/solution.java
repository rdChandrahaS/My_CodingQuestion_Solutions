class Solution {
    public List<List<Integer>> generate(int numRows) {
        numRows--;
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows==0) return ans;
        ans.add(new ArrayList<>(Arrays.asList(1,1)));
        if(numRows==1) return ans;

        for(int i = 2 ; i <= numRows ; i++){
            List<Integer> temp = new ArrayList<>();
            List<Integer> list = ans.get(i-1);
            for(int j = 0 ; j <= list.size() ; j++){
                if(j==0 || j==list.size()) temp.add(1);
                else{
                    temp.add(list.get(j-1) + list.get(j));
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}