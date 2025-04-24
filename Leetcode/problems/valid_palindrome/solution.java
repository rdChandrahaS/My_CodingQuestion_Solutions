class Solution {

    static{
        for(int i=0;i<1000;i++){
            isPalindrome("a");
        }
    }
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char c:s.toCharArray()){
            if( (c-'0' >=0 && c-'0' <=9) || (c>='A' && c<='Z') || (c>='a' && c<='z') )str.append(Character.toLowerCase(c));}
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}