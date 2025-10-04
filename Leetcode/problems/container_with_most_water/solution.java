class Solution {
    private int max(int a,int b){
        return a>b?a:b;
    }
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int area = 0;
        int temp = 0;

        while(start<end){
            if(height[start] > height[end]){
                temp = (end-start)*height[end];
                end--;
            }else if(height[start]<height[end]){ 
                temp = (end-start)*height[start];
                start++;
            }else{
                temp = (end-start)*height[start];
                start++;
                //end--;
            }
            area = max(area,temp);
        }
        return area;
    }
}