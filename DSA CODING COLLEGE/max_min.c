#include<stdio.h>
int global_max,global_min;

void max_min(int arr[],int low,int high){
    //if no. of element = 1
    if(low==high){
        global_max=global_min=arr[0];
        return;
    }

    //if no. of element = 2
    if(high==low+1){
        if(arr[low]<arr[high]){
            global_min=arr[low];
            global_max=arr[high];
        }else{
            global_max=arr[low];
            global_min=arr[high];
        }
        return;
    }

    int mid=low+(high-low)/2;
    max_min(arr,low,mid);
    max_min(arr,mid+1,high);   
}

int main(){
    int no,i;
    printf("Enter the number of elements : ");
    scanf("%d",&no);
    int arr[no];
    for(i=0;i<no;i++){
        scanf("%d",&arr[i]);
    }
    max_min(arr,0,no-1);
    printf("Max element : %d",global_max);
    printf("\nMin element : %d",global_min);

}
