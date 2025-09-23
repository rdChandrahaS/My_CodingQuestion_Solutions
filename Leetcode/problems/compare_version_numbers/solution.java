class Solution {
    public int edgeCase(int[] edge,int pointer,int winner){
        if(pointer >= edge.length) return 0;
        else if(edge[pointer] > 0)return winner;
        else return edgeCase(edge,pointer+1,winner);
    }
    public int ans(int[] a,int[] b,int pointer){
        if(pointer >= a.length && pointer < b.length ) return edgeCase(b,pointer,-1);
        else if(pointer >= b.length && pointer < a.length ) return edgeCase(a,pointer,1);
        else if(pointer == a.length && pointer == b.length) return 0;
        else if(a[pointer]==b[pointer]) return ans(a,b,pointer+1);
        else if(a[pointer] > b[pointer]) return 1;
        else return -1;
    }
    public int compareVersion(String version1, String version2) {
        int[] v1 = Arrays.stream(version1.split("\\."))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int[] v2 = Arrays.stream(version2.split("\\."))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        return ans(v1,v2,0);
    }
}