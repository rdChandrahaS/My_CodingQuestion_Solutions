class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = candies[0];
        for(int a : candies) {
            if(a > greatest) greatest = a;
        }
        List<Boolean> ans = new ArrayList<>();
        for(int a : candies){
            ans.add( (a + extraCandies)>= greatest ? true : false );
        }
        return ans;
    }
}