class Solution {
    public String reverse(String s){
        char[] temp = s.toCharArray();
        for(int i=0;i<temp.length/2;i++){
            char t = temp[i];
            temp[i] = temp[temp.length-1-i];
            temp[temp.length-1-i] = t;
        }
        return new String(temp);
    }
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            str[i]=reverse(str[i]);
        }
        return String.join(" ", str);
    }
}