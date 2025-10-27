class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int curr = 0;
        int total = 0;
        for(String str : bank){
            for(int i = 0 ; i < str.length() ; i++){
                curr += (str.charAt(i) - '0');
            }
            if(curr != 0){
                total += (prev * curr) ;
                prev = curr;
                curr = 0;
            }
        }
        return total;
    }
}