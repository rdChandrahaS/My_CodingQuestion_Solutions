class Solution {
    public static boolean posRow(int[][] matrix,int target,int start,int end,int i){
        if(start>end)
            return false;

        int mid=start+(end-start)/2;
        if(matrix[i][mid]==target){return true;}
        else if(matrix[i][mid] > target){return posRow(matrix,target,start,mid-1,i);}
        else return posRow(matrix,target,mid+1,end,i);
    }

    public static int posColumn(int[][] matrix,int target,int start,int end){
        if(start > end)
            return end;

        int mid=start+(end-start)/2;
        if((matrix[mid][0] < target)  && (matrix[mid][matrix[0].length-1] > target))return mid;
        else if(matrix[mid][0] > target)return posColumn(matrix,target,start,mid-1);
        else return posColumn(matrix,target,mid+1,end);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int val=posColumn(matrix,target,0,matrix.length-1);
        return (val==-1 || val==matrix.length)?false:posRow(matrix,target,0,matrix[0].length-1,val);
    }
}