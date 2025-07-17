class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> temp = new HashMap<>();
        for(int a:nums1){
            if(temp.containsKey(a)){
                temp.put(a,temp.get(a)+1);
            }else temp.put(a,1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int a:nums2){
            if(temp.containsKey(a)){
                if(temp.get(a)>1){
                    temp.put(a,temp.get(a)-1);
                }else temp.remove(a);
                ans.add(a);
            }
        }
        int[] answer = new int[ans.size()];
        int i=0;
        for(int a:ans)answer[i++]=a;
        return answer;
    }
}