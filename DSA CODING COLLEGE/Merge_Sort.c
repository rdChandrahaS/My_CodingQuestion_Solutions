#include<stdio.h>
//Merge two sorted arrays
void merge(int arr[],int low, int mid, int high){
    int arr1_size=mid-low+1,arr2_size=high-mid;
    int arr1[arr1_size],arr2[arr2_size],i,j,k;
    for(i=0;i<mid-low+1;i++)arr1[i]=arr[low+i];
    for(i=0;i<high-mid;i++)arr2[i]=arr[mid+i+1];
    i=j=0;
    k=low;
    while(i<(arr1_size) && j<(arr2_size))arr[k++] = (arr1[i]<arr2[j]) ? arr1[i++] : arr2[j++];
    while(i<(arr1_size))arr[k++]=arr1[i++];
    while(j<(arr2_size))arr[k++]=arr2[j++];
}


void merge_sort(int arr[],int low,int high){
    if(low<high){
        int mid=low+(high-low)/2;
        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
int main(){
    int no,i;
    printf("Enter the number of elements : ");
    scanf("%d",&no);
    int arr[no];
    for(i=0;i<no;i++){
        scanf("%d",&arr[i]);
    }
    merge_sort(arr,0,no-1);
    printf("After Merge Sort : ");
    for(i=0;i<no;i++){
        printf("%d\t",arr[i]);
    }
    return 0;
}
