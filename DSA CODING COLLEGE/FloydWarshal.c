#include<stdio.h>
#define INFINITY 99999
#define MAX_NODES 100

void FloydWarshal(int arr[MAX_NODES][MAX_NODES],int vertice_no,int source){
    int i,j,k;
    for(k=0;k<vertice_no;k++){
        for(i=0;i<vertice_no;i++){
            for(j=0;j<vertice_no;j++){
                if(arr[i][j] > (arr[i][k]+arr[k][j])){
                    arr[i][j]=(arr[i][k]+arr[k][j]);
                }
            }
        }
    }
    printf("Shortest Distance : \n");
    for(i=0;i<vertice_no;i++){
        for(j=0;j<vertice_no;j++){
            if(arr[i][j]==INFINITY)printf("INF\t");
            else printf("%d\t",arr[i][j]);
        }
        printf("\n");
    }
}

int main(){
    int vertice_no , edge_no , i , u , v , weight , graph[MAX_NODES][MAX_NODES],source;

    
    printf("Enter the number of vertices : ");
    scanf("%d",&vertice_no);
    printf("Enter the number of edges : ");
    scanf("%d",&edge_no);
    for(i=0;i<vertice_no;i++){
        for(u=0;u<vertice_no;u++){
            graph[i][u] = (i==u) ? 0 : INFINITY;
        }
    }
    printf("Enter in this format : source destination weight : \n");
    for (i=0;i<edge_no;i++) {
        scanf("%d %d %d", &u, &v, &weight);
        if (u>=0 && u<vertice_no && v>=0 && v<vertice_no)graph[u][v] = weight;
    }

    printf("Enter the source vertex : ");
    scanf("%d",&source);
    FloydWarshal(graph,vertice_no,source);
}
