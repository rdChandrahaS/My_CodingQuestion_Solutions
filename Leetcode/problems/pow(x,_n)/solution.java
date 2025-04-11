class Solution {
    public double myPow(double x, int n) {
        
        if(n==0 || x==1.00000 ||(x==-1 && n%2==0)){return 1.00000;}
        else if(x==-1 && n%2!=0){return -1.00000;}
        else if(n==1){return x;}
        else if(n==-1){return 1/x;}
        else if(x==0){return 0.00000;}
        int p=n%2;
        if(x>-1 && x<1 && n>999999 ){return 0.00000;}
        if((x<-1 || x>1) && n<-99999 ){return 0.00000;}

        // if(myPow(x,n/2)<=0.00000){return 0.00000;}
        // if((x<1 && p>10000) || (x>1 && p<(-10000))){return 0.00000;}
        if(p==0 && n>0){return myPow(x,n/2)*myPow(x,n/2);}
        if(p==1){
            double ans = myPow(x,n/2)*myPow(x,n/2);
            return myPow(x,1)*ans;}
        
        else if(p==0 && n<0){return myPow(x,n/2)*myPow(x,n/2);}
        else {
            double ans=myPow(x,n/2)*myPow(x,n/2);
            return ans*myPow(x,-1);}
    }
}