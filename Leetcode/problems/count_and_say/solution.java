class Solution {
    public String recursion(int n,String s){
        if(n==0)return s;
        else{
            StringBuilder sb = new StringBuilder();
            int count = 0;
            int pointer = 0;
            while(pointer < s.length()){
                count = 0;
                char ch = s.charAt(pointer);
                while(pointer<s.length() && ch == s.charAt(pointer)){ 
                    count++;
                    pointer++;
                }
                sb.append(count).append(ch);
            }
            return recursion(n-1,sb.toString());
        }
    }
    public String countAndSay(int n) {
        return recursion(n-1,"1");
    }
}