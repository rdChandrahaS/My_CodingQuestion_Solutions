class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();

        for(int i = len - 1 ; i >= 0 ; i--){

            List<Integer> temp = triangle.get(i);
            int jLen = temp.size();

            for(int j = jLen - 1 ; j >= 0 ; j--){
                
                if(i==triangle.size()-1)continue;
                
                List<Integer> tempBelow = triangle.get(i+1);

                int left = tempBelow.get(j) ;
                int right = tempBelow.get( (j==tempBelow.size()-1) ? j : j+1 );

                int minimum = temp.get(j) + Math.min(left,right);

                temp.set(j,minimum);
            }
        }
        return triangle.get(0).get(0);
    }
}