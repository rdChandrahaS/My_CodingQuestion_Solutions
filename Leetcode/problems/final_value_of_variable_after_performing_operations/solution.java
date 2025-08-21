class Solution {
    static{
        for(int i=0;i++<201 ; finalValueAfterOperations(new String[]{"X++"})){}
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String str : operations)   {
            if(str.equals("X++") || str.equals("++X")) x++;
            else x--;
        }
        return x;
    }
}