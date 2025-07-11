class Solution {
    public String reversePrefix(String word, char ch) {
        char[] temp = word.toCharArray();
        int index=0;
        while(index<word.length() && ch!=temp[index])index++;
        if(index==word.length())return word;
        for(int i=0;i<=index/2;i++){
            char c=temp[i];
            temp[i]=temp[index-i];
            temp[index-i]=c;
        }
        return new String(temp);
    }
}