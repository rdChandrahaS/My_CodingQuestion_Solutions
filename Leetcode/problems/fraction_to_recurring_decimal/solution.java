class Solution {
    public StringBuilder ans(long numerator,long denominator,HashMap<Long,Integer> set,StringBuilder sb){
        long div = numerator/denominator;
        long rem = numerator%denominator;
        if(rem==0) {
            return sb.append(div);
        }
        else if(!set.containsKey(numerator)){
            set.put(numerator,sb.length());
            sb.append(div);
            return ans(rem*10,denominator,set,sb);
        }else{
            int index = set.get(numerator);
            sb.insert(index,'(').append(')');
            return sb;
        }
    }
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0)return "0";
        StringBuilder sb = new StringBuilder();
        long up = numerator;
        long down = denominator;
        if(up < 0 ^ down < 0){
            sb.append('-');
            up = Math.abs(up);
            down = Math.abs(down);
        }
        long rem = up%down;
        long div = up/down;
        sb.append(div);
        if(rem == 0){
            return sb.toString();
        }else{
            sb.append('.');
            return ans(rem*10,down,new HashMap<>(),sb).toString();
        }
    }
}