class Solution {
    public int binary(char[] ch,char target,int low,int high){
        if(low>high)return low;
        int mid=low+(high-low);
        if(ch[mid]==target)return mid;
        else if(ch[mid] > target)return binary(ch,target,low,mid-1);
        else return binary(ch,target,mid+1,high);
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int p =binary(letters,target,0,letters.length-1);
        //p=(p==letters.length)?p-1:p;
        if(p==letters.length)return letters[0];
        else if(p==letters.length-1 && letters[p]==target)return letters[0];
        else if(letters[p]==target)return letters[p+1];
        else return letters[p];
    }
}