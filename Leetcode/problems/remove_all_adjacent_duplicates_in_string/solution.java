class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char temp = s.charAt(i);
            if(st.isEmpty()) st.push(temp);
            else if(st.peek()==temp)st.pop();
            else st.push(temp);
        }
        for(char ch : st)sb.append(ch);
        return sb.toString();
    }
}