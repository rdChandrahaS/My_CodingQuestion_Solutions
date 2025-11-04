class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer , Integer>> pq ;
        pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        int[] ans = new int[k];

        for(int i : nums){
            if(map.containsKey(i)){
                int n = map.get(i);
                map.put(i , n + 1);
            }else map.put(i,1);
        }
        pq.addAll(map.entrySet());
        int i = 0;
        while(i < k) ans[i++] = pq.poll().getKey();

        return ans;
    }
}