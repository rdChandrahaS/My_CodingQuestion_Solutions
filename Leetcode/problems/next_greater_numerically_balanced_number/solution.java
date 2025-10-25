class Solution {
    TreeSet<Integer> resultSet = new TreeSet<>();
    void abc(){
        resultSet.add(1224444);
        String[] st = new String[]{"1","22","221","333","3331","4444","33322","44441","55555","444422","555551","666666","333221"};
        for(String str : st)
            permute(str.toCharArray() , 0 , str.length() - 1);
    }        
    public int nextBeautifulNumber(int n) {
        int ans = 0;
        abc();
        while(!resultSet.isEmpty()){
            int temp = resultSet.pollFirst();
            if(temp > n){ 
                ans = temp;
                break; 
            }
        }
        return ans;
    }
    void permute(char[] arr, int l, int r) {
        if (l == r) {
            resultSet.add(Integer.parseInt(new String(arr)));
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            permute(arr, l + 1, r);
            swap(arr, l, i);
        }
    }
    void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
/**
* 1224444
* 666666
* 555551
* 444422
* 333221
* 55555
* 44441
* 33322
* 4444
* 3331
* 333
* 221
* 22
* 1
*/