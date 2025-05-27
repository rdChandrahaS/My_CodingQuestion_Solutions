#include<stdio.h>
#define MAX 100
#include<stdbool.h>

bool isVisited[MAX];
int queue[MAX],front=-1,rear=-1;

bool isEmpty() {return (front == -1 || front > rear);}
int dequeue(){return (isEmpty())?-1:queue[front++];}
void enqueue(int element){
    if(rear == MAX-1)return;
    if(front==-1)front=0;

    queue[++rear]=element;    
}

void BFS(int graph[MAX][MAX],int vertice_no){
    if(isEmpty())return;

    int current = dequeue(),i;
    printf("%d\t",current);
    for(i=0;i<vertice_no;i++){
        if(graph[current][i]==1 && !isVisited[i]){
            enqueue(i);
            isVisited[i]=true;
        }
    }
    BFS(graph, vertice_no);
}

int main(){
    int vertice_no,edge_no,i,j,u,v,start,graph[MAX][MAX]={0};
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

    enqueue(start);
    isVisited[start]=true;

    printf("\nBFS traversal : ");
    BFS(graph,vertice_no);

    return 0;
}