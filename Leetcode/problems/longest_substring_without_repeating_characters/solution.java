class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int low=0,high=0,len=0,tmp=0;
        char[] temp=s.toCharArray();
        len=high-low+1;

        while(low<=high && high<s.length()){
            if(set.add(temp[high])){
                high++;
                tmp=high-low+1;
            }else{
                set.remove(temp[low]);
                low++;
                tmp=high-low+1;
            }
            len=len>tmp?len:tmp;
        }
        return len-1;
    }
}