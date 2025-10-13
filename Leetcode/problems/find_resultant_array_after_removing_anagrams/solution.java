class Solution {
    public String sortedString(char[] ch){
        Arrays.sort(ch);
        return new String(ch);
    }
    public List<String> removeAnagrams(String[] words) {
        int i = 0;
        int j = 1;
        String str_i = "";
        String str_j = "";
        List<String> list = new LinkedList<>();
        while(i < words.length && j < words.length){
            if(str_i.equals("")){
                str_i = sortedString(words[i].toCharArray());
            }
            if(str_j.equals("")){
                str_j = sortedString(words[j].toCharArray());
            }
            if( !str_i.equals(str_j) ){
                list.add(words[i]);
                i = j;
                str_i="";
                j++;
                str_j="";
            }else{
                str_j="";
                j++;
            }
        }
        list.add(words[i]);
        return list;
    }
}