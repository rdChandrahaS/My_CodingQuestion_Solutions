class Solution {
    public int addDigits(int num) {
        if(num<10){return num;}
        else{
            String[] str=String.valueOf(num).split("");
            num=0;
            for(int i=0;i<str.length;i++){num=num+Integer.parseInt(str[i]);}
            return addDigits(num);
        }
    }
}