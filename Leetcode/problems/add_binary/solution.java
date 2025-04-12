class Solution {
    public static String equal(String longer, String shorter){
        while(shorter.length() < longer.length()){shorter="0"+shorter;}
        return shorter;}
    //sum function
    public static String sum(String a, String b,String c){
        return (Integer.parseInt(a) ^ Integer.parseInt(b) ^ Integer.parseInt(c)) == 0 ? "0" : "1";}
    //carry function
    public static String carry(String a, String b,String c){
        return (Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c) >= 2) ? "1" : "0";}

    public String addBinary(String a, String b) {
        a="0"+a;
        b="0"+b;
        

        //Making both binary digits equals
        if(a.length() > b.length()){b=equal(a,b);}
        else{a=equal(b,a);}

        String[] n1=a.split("");
        String[] n2=b.split("");
        //carry=0,sum=0
        String Cout="0",Sout="";
        for(int i=n1.length-1 ; i>=0 ; i--){
            Sout=sum(n1[i],n2[i],Cout) + Sout;
            Cout=carry(n1[i],n2[i],Cout);
        }
        if(Sout.charAt(0)=='0' && Sout.length()!=0){return Sout.substring(1);}
        else{return Sout;}
    }
}