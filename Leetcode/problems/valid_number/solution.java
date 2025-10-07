class Solution {
    public boolean isNumber(String s) {
        boolean exponent = false;

        boolean decimal = false;

        char[] num = s.toCharArray();

        boolean hasDigit = false;
        boolean hasDigitAfterE = true;

    
        for(int i = 0 ; i < num.length ; i++){
            char ch = num[i];
            if(ch=='e' || ch=='E'){
                if(!exponent){
                    if(i==num.length-1 || i==0 || !hasDigit) return false;
                    exponent = true;
                    hasDigitAfterE = false;
                }else return false;

            }else if(ch=='+' || ch=='-'){
                if (i == 0 || (num[i - 1] == 'e' || num[i - 1] == 'E')) {
                    if (i == num.length - 1) return false;
                } else return false;
                
            }else if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                return false;

            }else if(ch=='.'){
                if(!decimal){
                    decimal = true;
                    if(exponent) return false;
                }else return false;

            }if (ch >= '0' && ch <= '9') {
                hasDigit = true;
                if (exponent) hasDigitAfterE = true;
            }
        }
        if (!hasDigit) return false;
        if (exponent && !hasDigitAfterE) return false;

        return true;
    }
}