import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] num, int target) {
        int arr[]=new int[2];
        for(int i=0;i<num.length-1;i++){
            for (int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
                
            }
        }
    return arr;
    }

    public static void main(String[] args){
        Solution ob = new Solution();
        Scanner sc = new Scanner(System.in);
        int a[] = new int[1000];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int sol[] = ob.twoSum(a,n);
        System.out.println(sol);
    }
}