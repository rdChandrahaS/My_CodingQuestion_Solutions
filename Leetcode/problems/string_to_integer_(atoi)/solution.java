class Solution {
    public static String rfrontz(String s){
        char[] ch=s.toCharArray();
        int j=0,i,val=0;
        String ans="";
        if(ch[1]=='-' || ch[1]=='+')
            return String.valueOf(ch[0]);

        if(ch[0]=='-' || ch[0]=='+')
                j=1;

        for(i=j;i<ch.length;i++){
            if(ch[i] == '0')   
                val++;
            else
                break;
        }
        if(val==0)
            return s;
        for(j=i-1;j<ch.length;j++){
                ans=ans+String.valueOf(ch[j]);}
       // else
        if(ch[0]=='-' )
            ans="-"+ans;
        if( ch[0]=='+')
            ans="+"+ans;
        return ans;
    
    }
    public int myAtoi(String realS) {
        realS=realS.trim();
        String s="";
        
        if(realS.length()==0)
            return 0;
        else if(realS.length()==1)
            s=realS;
        else
            s=rfrontz(realS);
        // else if( s.length() == 1 && (s.equals("-") || s.equals("+"))
        //     return 0;
        char[] ch=s.toCharArray();
        //if( Character.isDigit(ch[0]) || ch[0]=='-' || ch[0] == '+'){
            String ans="";
            int i,j=0;
            if(ch[0]=='-' || ch[0]=='+')
                j=1;
            for(i=j;i<ch.length;i++){
                if(Character.isDigit(ch[i]))   
                    ans=ans+String.valueOf(ch[i]);
                else
                    break;
            }
            if(ans!=""){
                if(i<=13 && (Long.parseLong(ans) <= Integer.MAX_VALUE) && (Long.parseLong(ans) >= Integer.MIN_VALUE)){
                    if(ch[0]=='-'){
                        //ans = "-"+ans;
                        return Integer.parseInt(ans)*(-1);}
                    else
                        return Integer.parseInt(ans);
                }
                else if(ch[0]=='-'){
                    return Integer.MIN_VALUE;}
                else{
                    return Integer.MAX_VALUE;}
            }
            else
                return 0;
//        }
    }
}