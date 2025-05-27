#include <stdio.h>
#include <limits.h>

void matrixChainOrder(int p[], int n) {
    int m[n][n]; // m[i][j] = Minimum number of multiplications for matrices i to j

    // Initialize diagonal to 0 (single matrix multiplication cost is 0)
    for (int i = 1; i < n; i++)
        m[i][i] = 0;

    // l is chain length
    for (int l = 2; l < n; l++) {
        for (int i = 1; i < n - l + 1; i++) {
            int j = i + l - 1;
            m[i][j] = INT_MAX;
            for (int k = i; k < j; k++) {
                int cost = m[i][k] + m[k + 1][j] + p[i - 1]*p[k]*p[j];
                if (cost < m[i][j])
                    m[i][j] = cost;
            }
        }
    }

    printf("Minimum number of multiplications is %d\n", m[1][n - 1]);
}

int main() {
    int n;
    printf("Enter number of matrices: ");
    scanf("%d", &n);

    int p[n + 1]; // Dimensions array of size n+1
    printf("Enter dimensions (P0 P1 P2 ... Pn): ");
    for (int i = 0; i <= n; i++) {
        scanf("%d", &p[i]);
    }

    matrixChainOrder(p, n + 1);
    return 0;
}
