class Solution {
    static{
        for(int i=0;i<1000;i++)
            scoreOfString("");
    }
    public static int scoreOfString(String s) {
        char[] temp=s.toCharArray();
        int sum=0;
        for(int i=1;i<temp.length;i++){
            sum=sum+Math.abs((int)temp[i-1] - (int)temp[i]);
        }
        return sum;
    }
}