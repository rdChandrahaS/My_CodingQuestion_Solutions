class Solution {
    public String frequencySort(String s) {
        int[] loc=new int[68];
        for(char ch:s.toCharArray()){
            if(ch>='0' && ch<='9') loc[58 + (ch-'0')]++;
            else loc[ch-'A']++;}
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> {
                    if (a[1] != b[1]) return b[1] - a[1];  // higher freq first
                    return a[0] - b[0];                    // tie-break by char code
                }
            );
        for(int i=0;i<68;i++){
            if(loc[i]==0)continue;
            maxHeap.add(new int[]{i,loc[i]});}
        StringBuilder sb = new StringBuilder();
        char ch;
        int[] arr = new int[2];
        while( !maxHeap.isEmpty()){
            arr = maxHeap.poll();
            if(arr[0] >= 58) ch = (char)((arr[0]-58)+'0');
            else ch = (char)('A' + arr[0]);
            while(arr[1] > 0){
                sb.append(ch);
                arr[1]--;}
        }
        return sb.toString();
    }
}