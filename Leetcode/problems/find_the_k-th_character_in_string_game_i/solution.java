class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a"); 
        while(str.length() < k){
            StringBuilder temp = new StringBuilder();
            for(int i = 0 ; i < str.length() ; i++){
                temp.append( (char)('a' + (str.charAt(i)+1)%('a')) );
            }
            str.append(new StringBuilder(temp));
        }
        return str.charAt(k-1);
    }
}