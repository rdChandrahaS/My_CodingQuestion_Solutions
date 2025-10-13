class Solution {
    public boolean anangram(String str1 , String str2){
        if(str1.length() != str2.length()) return false;
        int[] loc = new int[26];
        for(int i = 0 ; i < str1.length() ; i++){
            loc[str1.charAt(i) - 'a']++;
            loc[str2.charAt(i) - 'a']--;
        }
        for(int i : loc){
            if(i != 0) return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new LinkedList<>();
        List<String> list = new LinkedList<>();
        Set<Integer> idx = new HashSet<>();
        for(int i = 0 ; i < strs.length ; i++){
            if( !idx.contains(i)){

                list.add(strs[i]);
                idx.add(i);

                for(int j = i+1 ; j < strs.length ; j++){
                    if(!idx.contains(j)){

                        if(anangram(strs[i],strs[j])){
                            list.add(strs[j]);
                            idx.add(j);
                        }
                    }
                }
                ans.add(new LinkedList<>(list));
                list.clear();
            }
        }
        return ans;
    }
}