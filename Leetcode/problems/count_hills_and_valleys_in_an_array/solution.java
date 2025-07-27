class Solution {
    public int countHillValley(int[] nums) {
        Stack<Integer> temp = new Stack<>();
        for(int a:nums){
            if(temp.empty()) temp.push(a);
            else if(temp.peek()==a)continue;
            else temp.push(a);
        }
        int ans=0;
        while(temp.size() > 2){
            int prev = temp.pop();
            int curr = temp.pop();
            int next = temp.peek();
            temp.push(curr);
            if((prev>curr && next>curr) || (prev<curr && next<curr))  
                ans++;
        }
        return ans;
    }
}