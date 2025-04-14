class Solution {
    public int sum(int a,int b){return (a+b)%10;}
    public int carry(int a,int b){return (a+b)/10;}

    public int[] plusOne(int[] digits) {
        List<Integer> ans = new LinkedList<>();
        int i,c=1;
        for(i=digits.length-1;i>=0;i--){
            ans.add(0,sum(digits[i],c));
            c=carry(digits[i],c);
        }
        if(c!=0){ans.add(0,c);}
        int[] arr=new int[ans.size()];
        for(i=0;i<arr.length;i++){arr[i]=ans.get(i);}
        ans.clear();
        return arr;
    }
}