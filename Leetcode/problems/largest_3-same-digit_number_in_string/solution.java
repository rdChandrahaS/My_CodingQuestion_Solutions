class Solution {
    public String largestGoodInteger(String num) {
        char ans='0';
        boolean flag=false;
        for(int i = 0 ; i < num.length()-2 ; i++){
            if(ans <= num.charAt(i) && ( num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2) ) ){
                ans = num.charAt(i);
                flag=true;
            }
        }
        return flag ? String.format("%c%c%c", ans, ans, ans):"";
    }
}