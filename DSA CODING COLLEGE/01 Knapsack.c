#include <stdio.h>

int max(int a, int b) {
    return (a > b) ? a : b;
}

int knapsack_0/1(int W, int wt[], int val[], int n) {
    int K[n+1][W+1];
    for (int i = 0; i <= n; i++) {
        for (int w = 0; w <= W; w++) {
            if (i == 0 || w == 0)
                K[i][w] = 0;
            else if (wt[i-1] <= w)
                K[i][w] = max(val[i-1] + K[i-1][w - wt[i-1]], K[i-1][w]);
            else
                K[i][w] = K[i-1][w];
        }
    }
    return K[n][W];
}

int main() {
    int n, W;
    printf("Enter number of items: ");
    scanf("%d", &n);
    int val[n], wt[n];
    printf("Enter values:\n");
    for (int i = 0; i < n; i++) scanf("%d", &val[i]);
    printf("Enter weights:\n");
    for (int i = 0; i < n; i++) scanf("%d", &wt[i]);
    printf("Enter knapsack capacity: ");
    scanf("%d", &W);
    int maxValue = knapsack_0/1(W, wt, val, n);
    printf("Maximum value in knapsack = %d\n", maxValue);
    return 0;
}
