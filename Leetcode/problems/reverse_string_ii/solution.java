class Solution {
    public void reverse(char[] arr,int low,int high){
        for(int i=0;i<(high-low+1)/2;i++){
            char temp=arr[low+i];
            arr[low+i] = arr[high-i];
            arr[high-i] = temp;
        }
    }
    public String reverseStr(String s, int k) {
        k = s.length() < k ? s.length() : k;
        char[] temp = s.toCharArray();
        int start=0,end=k-1;
        while(start<temp.length && start<end){
            reverse(temp,start,end);
            start=end+k+1;
            end=(start+k-1) > temp.length-1 ? temp.length-1 : start+k-1;;
        }
        return new String(temp);
    }
}