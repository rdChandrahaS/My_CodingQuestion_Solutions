class Solution {
    public boolean isSelfDividing(int n){
        if(n<10 || n==11 || n==12 || n==15) return true;
        String[] str = String.valueOf(n).split("");
        for(String st:str){
            int temp = Integer.parseInt(st);
            if(temp==0 || n % temp != 0) return false;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)) ans.add(i);
        }
        return ans;
    }
}