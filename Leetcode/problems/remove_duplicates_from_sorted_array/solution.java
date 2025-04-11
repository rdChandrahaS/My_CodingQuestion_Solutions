class Solution {
    public static boolean isInArray(ArrayList<Integer>arr , int n){
        for(int i=0;i<arr.size();i++){
            if( n==arr.get(i) ) //&& i==arr.size()-1 ){
                return true;   
        }
        return false;
    }
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){    
            if(!isInArray(arr,nums[i])){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]= arr.get(i);  
        }
    return arr.size();
    }
}