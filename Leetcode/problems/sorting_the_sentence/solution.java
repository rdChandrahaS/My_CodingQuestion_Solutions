class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" "); 
        Arrays.sort(str, (a,b)-> (a.charAt(a.length() - 1) -  b.charAt(b.length() - 1) )); 
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(String st : str){
            temp = new StringBuilder(st);
            temp.deleteCharAt(st.length()-1);
            sb.append(temp).append(" ");
        }
        return sb.toString().trim();
    }
}