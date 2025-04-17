class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && nums1.length==1){nums1[0]=nums2[0];return;}
        int p1=m-1,p2=n-1,i;
        for(i=m+n-1;i>=0 && p1>=0 && p2>=0;i--){
            if(nums1[p1]>=nums2[p2]){
                nums1[i]=nums1[p1];
                p1--;}
            else{
                nums1[i]=nums2[p2];
                p2--;
            }
        }
        if(p1==-1){
            while(p2>=0 && i>=0){
                nums1[i]=nums2[p2];
                i--;
                p2--;
            }
        }
        else{
            while(p1>=0 && i>=0){
                nums1[i]=nums1[p1];
                i--;
                p1--;
            }
        }
    }
}