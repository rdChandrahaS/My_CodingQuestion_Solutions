class Solution {
    public String winningPlayer(int x, int y) {
    int i=0;
        while(x>=1 && y>=4){
        i++;
        x-=1;
        y-=4;}
        return i%2==0?"Bob":"Alice";
    }
}