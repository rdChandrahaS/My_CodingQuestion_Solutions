class Solution {
    public int pow(int x){
        int ans=0;
        while(x!=1){
            if(x%2==0){
                x/=2;
                ans++;}
            else {
                x=3*x + 1;
                ans++;}
        }
        return ans;
    }
    public int getKth(int lo, int hi, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) return Integer.compare(a[0], b[0]);
                return Integer.compare(a[1], b[1]);
            }
        });
        for(int i=lo;i<=hi;i++){
            pq.add(new int[]{i,pow(i)});
        }
        int[] ans=new int[2];
        for(int i=0;i<k;i++) ans=pq.poll();
    return ans[0];
    }
}