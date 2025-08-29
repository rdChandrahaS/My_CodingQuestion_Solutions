class Solution {
    public int mostWordsFound(String[] sentences) {
        String[] temp;
        int ans = 0;
        for(String s : sentences){
            temp = s.split(" ");
            ans = ans < temp.length ? temp.length : ans;
        }
        return ans;
    } 
}