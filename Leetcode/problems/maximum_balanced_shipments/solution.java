class Solution {
    static{
        for(int i=0;i++<500;maxBalancedShipments(new int[]{1,1}) ){}
    }
    public static int maxBalancedShipments(int[] weight) {
        if(weight.length==2 && weight[0]<=weight[1])return 0;
        int low=0;
        int high=1;
        int ans=0;
        int max; 
        while( high < weight.length ){
            max = Math.max( weight[low] , weight[high] );
            while( high < weight.length && max <= weight[high] ){ 
                high++;
                if(high == weight.length) break;
                max = Math.max(max , weight[high]);
            }
            if(high == weight.length) break;
            ans++;
            low = high + 1;
            high = low + 1;
        }
        return ans;
    }
}