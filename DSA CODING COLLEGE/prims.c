#include<stdio.h>
#include<stdbool.h>
#include<limits.h>
#define MAX_NODES 100
#define INFINITY 999999

bool isVisited[MAX_NODES];

void prims(int graph[MAX_NODES][MAX_NODES],int start,int vertice_no){
    int i,j,min,source,destination,edge_count=0;
    for(i=0;i<vertice_no;i++)isVisited[i]=false;
    isVisited[start]=true;

    while(edge_count < vertice_no-1){
        min = INFINITY;
        source=-1;
        destination=-1;

        for(i=0;i<vertice_no;i++){
            if(isVisited[i]){
            for(j=0;j<vertice_no;j++){
                if(!isVisited[j] && graph[i][j] < min && graph[i][j] != INFINITY){
                    min = graph[i][j];
                    source = i;
                    destination = j;
            }
        }
    }
}

        if(source != -1 && destination != -1){
            printf("%d -> %d : %d \n",source,destination,graph[source][destination]);
            isVisited[destination]=true;
            edge_count++;
        }else{
            printf("disconnected graph");
            break;
        }
    }
}

int main(){
    int vertice_no,edge_no,i,j,u,v,weight,graph[MAX_NODES][MAX_NODES],start;
    printf("Enter the number of vertices : ");
    scanf("%d",&vertice_no);

    //Initialize all values to infinity
    for(i=0;i<vertice_no;i++){for(j=0;j<vertice_no;j++)graph[i][j]=INFINITY;}

    printf("Enter the number of edges : ");
    scanf("%d",&edge_no);

    printf("Enter in this format : source destination weight : \n");
    for(i=0;i<edge_no;i++){
        scanf("%d %d %d",&u,&v,&weight);
        graph[u][v]=graph[v][u]=weight;}

    printf("Enter the start vertex : ");
    scanf("%d",&start);

    prims(graph,start,vertice_no);
}