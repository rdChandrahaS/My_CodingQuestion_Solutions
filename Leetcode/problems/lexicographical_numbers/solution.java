class Solution {
    public List<Integer> lexicalOrder(int n) {
        String[] st=new String[n];
        for(int i=1;i<=n;i++)st[i-1]=Integer.toString(i);
        Arrays.sort(st);
        List<Integer> ans =new ArrayList<>();
        for(String str:st)ans.add(Integer.parseInt(str));
        return ans;
    }
}