class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr){
            if( map.containsKey(n)){
                int count = map.get(n);
                map.replace( n , count + 1 );
            }else map.put(n,1);
        }
        for(Integer n : map.values()) set.add(n);
        return set.size()==map.size();
    }
}