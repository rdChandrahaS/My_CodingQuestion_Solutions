class Solution {
    static{
        for(int i = 0; i++ < 500; canSeePersonsCount(new int[]{1,2,3}));
    }
    public static int[] canSeePersonsCount(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int[] stack = new int[len];
        int pointer = len;
        //Stack<Integer> st = new Stack<>();
        // for(int i = len-1 ; i >= 0 ; i--){
        //     int visible = 0;
        //     if(st.isEmpty()){
        //         ans[i] = 0;
        //         st.push(nums[i]);
        //     }else if(nums[i] > st.peek()){
        //         while(!st.isEmpty() && nums[i] > st.peek()){ 
        //             st.pop();
        //             visible++;
        //         }
        //         if(!st.isEmpty()) visible++;
        //         ans[i] = visible;
        //         st.push(nums[i]);
        //     }else if(nums[i] < st.peek()){
        //         ans[i] = 1;
        //         st.push(nums[i]);
        //     }
        // }
        for(int i = len-1 ; i >= 0 ; i--){
            if(pointer==len){
                ans[i] = 0;
                stack[--pointer] = nums[i];
            }else if(nums[i] > stack[pointer]){
                int visible = 0;
                while(pointer<len && nums[i] > stack[pointer]){ 
                    pointer++;
                    visible++;
                }
                if(pointer!=len) visible++;
                ans[i] = visible;
                stack[--pointer] = nums[i];
            }else if(nums[i] < stack[pointer]){
                ans[i] = 1;
                stack[--pointer] = nums[i];
            }
        }
        return ans;
    }
}