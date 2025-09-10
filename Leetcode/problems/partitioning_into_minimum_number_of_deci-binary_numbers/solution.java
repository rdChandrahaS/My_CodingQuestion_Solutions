class Solution {
    public int minPartitions(String n) {
        int i = 0;
        for(char ch : n.toCharArray()){
            if((ch-'0') > i){
                i = ch-'0';
            }
        }
        return i;
    }
}