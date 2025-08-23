class Solution {
    public String[] findRelativeRanks(int[] score) {
        Queue<int[]> pq = new PriorityQueue<>((a,b)->(b[0]-a[0]));
        for(int i = 0 ; i < score.length ; i++) pq.offer(new int[]{score[i],i});
        int count = 1;
        String[] ans = new String[score.length];
        while(!pq.isEmpty()){
            int[] p = pq.poll();
            String t = switch(count){
                case 1 -> "Gold Medal";
                case 2 -> "Silver Medal";
                case 3 -> "Bronze Medal";
                default -> String.valueOf(count);
            };
            count++;
            ans[p[1]] = t;
        }
        return ans;
    }
}