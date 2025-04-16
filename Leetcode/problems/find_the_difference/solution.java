class Solution {
    public char findTheDifference(String s, String t) {
        int a=0,b=0;
        for(char p:s.toCharArray()){a^=p;}
        for(char p:t.toCharArray()){b^=p;}
        return (char)(a^b);
    }
}