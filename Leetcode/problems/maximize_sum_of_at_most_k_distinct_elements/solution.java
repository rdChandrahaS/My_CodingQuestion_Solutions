class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> pq = new TreeSet<>((a,b)->(b-a));
        for(int a : nums) pq.add(a);
        k = pq.size() > k ? k : pq.size();
        int[] ans = new int[k];
        int i = 0;
        int temp = -1;
        while(i<k){
            ans[i] = pq.pollFirst();
            i++;
        }
        return ans;
    }
}