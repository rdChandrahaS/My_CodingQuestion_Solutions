#include<stdio.h>
#define MAX 100
#include<stdbool.h>

bool isVisited[MAX];
int stack[MAX],top=-1;
void push(int element){
    if(top >= MAX-1)return;
    stack[++top]=element;}
int pop(){return (top <= -1)? -1 : stack[top--];}

void DFS(int graph[MAX][MAX],int start,int vertice_no){
    isVisited[start]=true;
    int i;
    printf("%d\t",start);
    for(i=0;i<vertice_no;i++){
        if(graph[start][i]==1 && !isVisited[i])DFS(graph,i,vertice_no);
    }
}

int main(){
    int vertice_no,edge_no,i,j,u,v,start,graph[MAX][MAX];
    printf("Enter the number of vertices : ");
    scanf("%d",&vertice_no);

    for(i=0;i<vertice_no;i++)isVisited[i]=false;

    printf("Enter the number of edges : ");
    scanf("%d",&edge_no);

    printf("Enter in this format : source destination : \n");
    for(i=0;i<edge_no;i++){
        scanf("%d %d",&u,&v);
        graph[u][v]=graph[v][u]=1;
    }

    printf("\nEnter the start vertex : ");
    scanf("%d",&start);

    printf("\nDFS traversal : ");
    DFS(graph,start,vertice_no);

    return 0;
}