class Solution {
    public int findComplement(int num) {
        int temp=num,xor=1;
        while(temp>0){
            temp/=2;
            xor*=2;
        }
        return ((xor-1)^num);
    }
}