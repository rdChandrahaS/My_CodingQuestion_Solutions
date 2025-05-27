#include<stdio.h>
void sort(int weight[],int profit[],int proft_weight_ratio[],int n){
    int i,j;
    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(proft_weight_ratio[i]<proft_weight_ratio[j]){
                proft_weight_ratio[i]=proft_weight_ratio[i]^proft_weight_ratio[j]^(proft_weight_ratio[j]=proft_weight_ratio[i]);
                weight[i]=weight[i]^weight[j]^(weight[j]=weight[i]);
                profit[i]=profit[i]^profit[j]^(profit[j]=profit[i]);
            }
        }
    }
}
void knapsack(int profit[],int weight[],int n,int max){
    int i,p=0;
    for(i=0;i<n;i++){
        if(max>0 && weight[i]<=max){
            max-=weight[i];
            p+=profit[i];
        }else{
            if(max>0)p+=max* profit[i]/weight[i];
        }
    }
    printf("Total Profit : %d",p);
}

int main(){
    int i,n,max;
    printf("How many items ?  : ");
    scanf("%d",&n);
    int profit[n],weight[n],profit_weight_ratio[n];
    printf("Enter the weight and profit of elements : \n");
    for(i=0;i<n;i++){
        scanf("%d %d",&weight[i] , &profit[i] );
        profit_weight_ratio[i]=profit[i]/weight[i];
    }
    sort(weight,profit,profit_weight_ratio,n);
    printf("Maximum capacity : ");
    scanf("%d",&max);
    knapsack(profit,weight,n,max);
}