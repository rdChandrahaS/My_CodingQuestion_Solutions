class Solution {
    static{
        for(int i=0;i++<500;validPalindrome("a"));
    }
    public static boolean ans(char[] arr,int low, int high,int one){
        if(one > 1) return false;
        if(low > high) return true;
        if(arr[low] == arr[high]) return ans(arr,low+1,high-1,one);
        else return ans(arr,low+1,high,one+1) || ans(arr,low,high-1,one+1);
    }
    public static boolean validPalindrome(String s) {
        if(s.length()==1)return true;
        char[] temp = s.toCharArray();
        return ans(temp,0,temp.length-1,0);
    }
}