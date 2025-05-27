#include <stdio.h>
#include <stdbool.h>

#define MAX 100

int graph[MAX][MAX],color[MAX],V, M;

bool isSafe(int v, int c) {
    for (int i = 0; i < V; i++) {
        if (graph[v][i] == 1 && color[i] == c)
            return false;
    }
    return true;
}

bool graphColoring(int v) {
    if (v == V) return true;

    for (int c = 1; c <= M; c++) {
        if (isSafe(v, c)) {
            color[v] = c;
            if (graphColoring(v + 1))
                return true;
            color[v] = 0;
        }
    }
    return false;
}

int main() {
    int E, u, v;

    printf("Enter number of vertices: ");
    scanf("%d", &V);
    printf("Enter number of edges: ");
    scanf("%d", &E);

    for (int i = 0; i < V; i++) {
        color[i] = 0;
        for (int j = 0; j < V; j++)
            graph[i][j] = 0;
    }

    printf("Enter edges:\n");
    for (int i = 0; i < E; i++) {
        scanf("%d %d", &u, &v);
        graph[u][v] = graph[v][u] = 1;
    }

    printf("Enter number of colors: ");
    scanf("%d", &M);

    if (graphColoring(0)) {
        printf("Solution exists. Assigned colors:\n");
        for (int i = 0; i < V; i++)
            printf("Vertex %d ---> Color %d\n", i, color[i]);
    } else {
        printf("No solution exists with %d colors.\n", M);
    }

    return 0;
}
