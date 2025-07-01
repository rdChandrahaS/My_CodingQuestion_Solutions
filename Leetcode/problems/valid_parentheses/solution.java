class Solution {
    static{
        for(int i=0;i<1000;i++){
            isValid("()");
        }
    }
    public static boolean isValid(String s) {
        if(s.length()%2 != 0)return false;
        Stack<Character> temp = new Stack<>();
        for(char a:s.toCharArray()){
            if(temp.empty())temp.push(a);
            else if((temp.peek()=='(' && a==')') || (temp.peek()=='{' && a=='}') || (temp.peek()=='[' && a==']')){
                temp.pop();
            }else temp.push(a);
        }
        return temp.empty()?true:false;
    }
}