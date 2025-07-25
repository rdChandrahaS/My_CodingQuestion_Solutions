class Solution {
    public void mergeSort(int[][] arr,int low,int high){
        if(low < high){
            int mid=low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            mergeSo(arr,low,mid,high);
            }
        }
    public void mergeSo(int[][] arr, int low,int mid,int high){
        int p1=0,p2=0,arr1Size=mid-low+1,arr2Size=high-mid ,start=low;
        int[][] arr1 = new int[arr1Size][2];
        int[][] arr2 = new int[arr2Size][2];
        for(int i=0;i<arr1Size;i++){
            arr1[i][0] = arr[low+i][0];
            arr1[i][1] = arr[low+i][1];}
        for(int i=0;i<arr2Size;i++){
            arr2[i][0] = arr[mid+1+i][0];
            arr2[i][1] = arr[mid+1+i][1];}
        while( p1 < arr1Size && p2< arr2Size ){
            if(arr1[p1][0] > arr2[p2][0]){
                arr[start][0] = arr2[p2][0];
                arr[start][1] = arr2[p2][1];
                p2++;
            }else{
                arr[start][0] = arr1[p1][0];
                arr[start][1] = arr1[p1][1];
                p1++;}
            start++;}
        while(p1 < arr1Size){
            arr[start][0] = arr1[p1][0];
            arr[start][1] = arr1[p1][1];
            start++;
            p1++;}
        while(p2< arr2Size){
            arr[start][0] = arr2[p2][0];
            arr[start][1] = arr2[p2][1];
            p2++;
            start++;}
    }
    public int[][] answer(int[][] matrix){
        ArrayList<int[]> ans = new ArrayList<>();
        for(int i=0;i<matrix.length-1;i++){
            if(matrix[i][0] == matrix[i+1][0]){
                ans.add( new int[]{ matrix[i][0] , Math.max(matrix[i][1],matrix[i+1][1]) } );
                i++;
            }else if(matrix[i][1] >= matrix[i+1][0]){
                ans.add( new int[]{ matrix[i][0] ,Math.max(matrix[i+1][1],matrix[i][1]) } );
                i++;
            }else{
                ans.add(new int[]{ matrix[i][0],matrix[i][1] });
            }
        }
        ans.add(new int[]{ matrix[matrix.length-1][0],matrix[matrix.length-1][1] });
        return ans.size()==matrix.length ? ans.toArray(new int[ans.size()][]) : answer(ans.toArray(new int[ans.size()][]));
    }
    public int[][] merge(int[][] matrix) {
        if(matrix.length == 1) return matrix;
        mergeSort(matrix,0,matrix.length-1);
        matrix = answer(matrix);
        int size=0;
        if(matrix[matrix.length-2][1] >= matrix[matrix.length-1][0]) size=1;
        int[][] ans = new int[matrix.length-size][2];
        for(int i=0;i<ans.length;i++){
            ans[i][0]=matrix[i][0];
            ans[i][1]=matrix[i][1];
        }
        return ans;
    }
}