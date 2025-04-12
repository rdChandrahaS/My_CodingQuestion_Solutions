class Solution {
    public boolean isHappy(int n) {
        //breaking the digits into string.
        String[] num=String.valueOf(n).split("");
        //reusing n variable
        n=0;
        for(int i=0;i<num.length;i++){
            n = n + Integer.parseInt(num[i])*Integer.parseInt(num[i]);
        }
        if(n==1){return true;}
        else if(n==4){return false;}
        else{return isHappy(n);}
    }
}