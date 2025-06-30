class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> temp = new HashSet<>();
        int zero_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) zero_count++;
            if(arr[i] != 0) temp.add(arr[i]);
            if(zero_count>1 || temp.contains(arr[i]*2) || (arr[i]%2==0 && temp.contains(arr[i]/2)))return true;
        }
        return false;
    }
}