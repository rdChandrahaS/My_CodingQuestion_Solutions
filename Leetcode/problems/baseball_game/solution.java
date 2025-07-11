class Solution {
    public int calPoints(String[] operations) {
        // Stack<Integer> temp = new Stack<>();
        // int ans=0;
        // for(String str:operations){
        //     if(str.equals("C")) temp.pop();
        //     else if(str.equals("+")){
        //         int top = temp.pop();
        //         int top_1 = temp.peek();
        //         temp.push(top);
        //         temp.push(top+top_1);
        //     }else if(str.equals("D")) temp.push(temp.peek()*2);
        //     else temp.push(Integer.parseInt(str));
        // }
        // while(temp.size()!=0)ans+=temp.pop();
        // return ans;
        int ans=0,index=0;
        int[] temp = new int[operations.length];
        for(String str:operations){
            if(str.equals("C")) temp[--index]=0;
            else if(str.equals("+")) temp[index++]=temp[index-2]+temp[index-3];
            else if(str.equals("D")) temp[index++]=temp[index-2]*2;
            else temp[index++]=Integer.parseInt(str);
        }
        for(int i:temp)ans+=i;
        return ans;
    }
}