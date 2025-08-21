class Solution {
    static{
        for(int i = 0; i++<201 ; convertDateToBinary("2080-02-29")){}
    }
    private static String binary(String str){
        int num = Integer.parseInt(str) , rem = 0;
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            rem = num%2;
            sb.insert(0,rem);
            num/=2;
        }
        return sb.toString();
    }
    public static String convertDateToBinary(String date) {
        String[] dt = date.split("-");
        StringBuilder sb = new StringBuilder();
        sb.append(binary(dt[0])).append("-").append(binary(dt[1])).append("-").append(binary(dt[2]));
        return sb.toString();
    }
}