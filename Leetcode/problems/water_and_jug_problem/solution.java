class Solution {
    private boolean ans(int A,int B,int a,int b,int goal,HashSet<String> set){
        if(a==goal || b==goal || a+b==goal) return true;
        var ab = a+","+b;
        if (a > A || b > B || a < 0 || b < 0 || set.contains(ab))return false;
        set.add(ab);
        return  ans(A,B,A,b,goal,set) ||
                ans(A,B,a,B,goal,set) ||
                ans(A,B,a,0,goal,set) ||
                ans(A,B,0,b,goal,set) ||
                ans(A,B,A,b-(A-a),goal,set) ||
                ans(A,B,a-(B-b),B,goal,set) ||
                ans(A,B,0,a+b,goal,set) ||
                ans(A,B,a+b,0,goal,set);
    }
    public boolean canMeasureWater(int x, int y, int goal) {
        return ans(x,y,0,0,goal,new HashSet<>());
    }
}