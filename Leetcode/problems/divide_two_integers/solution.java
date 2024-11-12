class Solution {
    public int divide(int dividend, int divisor) {
        long ans = (long)dividend/divisor;
        long lim = Integer.MAX_VALUE;
        int answer;
        if(ans > lim )
            return Integer.MAX_VALUE;
        else
            answer = (int)ans;
            return answer;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int dnd = sc.nextInt();
        int dor = sc.nextInt();
        Solution ob = new Solution();
        System.out.println(ob.divide(dnd,dor));

    }
}