class Solution {
    public static boolean isVowel(char ch){
        if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U')){return true;}
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder stb = new StringBuilder(s);
        if(s.length()==1){return s;}
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<j && isVowel(stb.charAt(i)) && !isVowel(stb.charAt(j)) ){j--;}
            while(i<j && !isVowel(stb.charAt(i)) && isVowel(stb.charAt(j)) ){i++;}
            while(i<j && isVowel(stb.charAt(i)) && isVowel(stb.charAt(j))){
                char temp=stb.charAt(j);
                stb.setCharAt(j,stb.charAt(i));
                stb.setCharAt(i,temp);
                i++;
                j--;
            }
            while(i<j && !isVowel(stb.charAt(i)) && !isVowel(stb.charAt(j))) {
                j-- ;
                i++;}
        }
        return stb.toString();
    }
}