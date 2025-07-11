class Solution {
    public String clearDigits(String s) {
        // Stack<Character> temp = new Stack<>();
        // for(char ch: s.toCharArray()){
        //     if(ch>='a' && ch<='z')temp.push(ch);
        //     else temp.pop();
        // }
        // Iterator<Character> iterator = temp.iterator();
        // StringBuilder sb = new StringBuilder();

        // while (iterator.hasNext()) {
        //     sb.append(iterator.next());
        // }
        // return sb.toString();

        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch>='a' && ch<='z')sb.append(ch);
            else sb.deleteCharAt(sb.length() - 1);}
        return sb.toString();
    }
}