class Solution {
    public boolean isThree(int n) {
        if(n==1 || n==2 || n==3){return false;}
        int c=1;
        for(int i=1;i<n/2+1;i++){if(n%i==0){c++;if(c>3){return false;}}}
        return c==3?true:false;
    }
}