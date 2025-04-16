class Solution {
    public boolean AliceWins(int n,int gameHappens){
        for(int i=1;i<n;i++){if(n%i==0)return AliceWins(n-i,gameHappens+1);}
        if(n==1 && gameHappens%2==0)return false;
        else return true;
        }
    public boolean divisorGame(int n) {
        return AliceWins(n,0);
    }
}