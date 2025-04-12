class Solution {
    // public static boolean isPresent(ArrayList<Integer> arr,int num){
    //     for(int i=0;i<arr.size();i++){if(arr.get(i)==num{return true;})}
    //     return false;
    // }

    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        //int n = nums1.length>nums2.length?nums2.length:nums1.length;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if((nums1[i]==nums2[j]) && !ans.contains(nums1[i])){
                    ans.add(nums1[i]);
                }
            }
        }
        int[] ar=new int[ans.size()];
        for(int i=0;i<ans.size();i++){ar[i]=ans.get(i);}
        return ar;
    }
}