class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums)pq.add(i);
        int ans=nums[0];
        for(int i=0;i<=nums.length-k;i++) ans = pq.poll();
        return ans;
    }
}