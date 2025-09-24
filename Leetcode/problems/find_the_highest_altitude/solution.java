class Solution {
    public int largestAltitude(int[] gain) {
        int temp = gain[0];
        for(int i = 1 ; i < gain.length ; i++){
            gain[i] = gain[i] + gain[i-1];
            if(gain[i] > temp) temp=gain[i];
        }
        return Math.max(0,temp);
    }
}