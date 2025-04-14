class Solution {
    public String excel(int n){
        if(n==0)return "A";
        else if(n==1)return "B";
        else if(n==2)return "C";
        else if(n==3)return "D";
        else if(n==4)return "E";
        else if(n==5)return "F";
        else if(n==6)return "G";
        else if(n==7)return "H";
        else if(n==8)return "I";
        else if(n==9)return "J";
        else if(n==10)return "K";
        else if(n==11)return "L";
        else if(n==12)return "M";
        else if(n==13)return "N";
        else if(n==14)return "O";
        else if(n==15)return "P";
        else if(n==16)return "Q";
        else if(n==17)return "R";
        else if(n==18)return "S";
        else if(n==19)return "T";
        else if(n==20)return "U";
        else if(n==21)return "V";
        else if(n==22)return "W";
        else if(n==23)return "X";
        else if(n==24)return "Y";
        else return "Z";
    } 
    public String convertToTitle(int columnNumber) {
        String ans="";
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            ans=excel(rem)+ans;
            columnNumber=columnNumber/26;
        }
        return ans;
    }
}