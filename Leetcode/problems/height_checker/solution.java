class Solution {
    public int heightChecker(int[] heights) {
        int ans=0,i,temp=0;
        int[] loc = new int[101];
        int[] expected = new int[heights.length];

        for(int a:heights)loc[a]++;
        for(i=0;i<loc.length-1;){
            if(loc[i]<1) i++;
            else{
                expected[temp++]=i;
                loc[i]--;
            }
        }
        for(i=0;i<expected.length;i++){
            if(expected[i] != heights[i]) ans++;}
        return ans;
    }
}