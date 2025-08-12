class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length-1;
        int carry = 1;
        int t;
        for(int i = last ; i >=0 ; i--){
            t = digits[i];
            digits[i] = (t + carry) % 10;
            carry = ( t + carry ) / 10;
            if(carry == 0) break;
        }
        if(carry == 0) return digits;
        else{
            int[] temp = new int[digits.length+1];
            temp[0]=carry;
            for(int i = 1 ;i < temp.length ; i++){ temp [i] = digits[i-1];}
            return temp;
        }
    }
}