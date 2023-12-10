#include <stdio.h>
#include <stdlib.h>
#define MAX 500
int main() {
  int i, j, n, f, x, y;
  char m[MAX][MAX];
  scanf("%d %d\n", &n, &f);
  for (i = 0; i < n; i++) {
    for (j = 0; j < n; j++) {
      scanf(" %c", &m[i][j]);
    }
  }
  if (m[0][0] < (48 + f)) {
    m[0][0] = '*';
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        if (m[i][j] <= (48 + f) && m[i - 1][j] == '*') {
          m[i][j] = '*';
        }
        x = j;
        while (((m[i][x] <= (48 + f) && m[i][x + 1] == '*') ||
                (m[i][x - 1] <= (48 + f) && m[i][x] == '*')) &&
               x >= 0) {
          m[i][x] = '*';
          x--;
        }
        x = j;
        while (((m[i][x] <= (48 + f) && m[i][x - 1] == '*') ||
                (m[i][x + 1] <= (48 + f) && m[i][x] == '*')) &&
               x <= n) {
          m[i][x] = '*';
          x++;
        }
/* Caso em que a lava subir e for para os lados na subida
        y = i;
        while (m[y - 1][j] <= (48 + f) && m[y][j] == '*' && y >= 0) {
          m[y - 1][j] = '*';
          y--;
          x = j;
          while (((m[i][x] <= (48 + f) && m[i][x + 1] == '*') ||
                  (m[i][x - 1] <= (48 + f) && m[i][x] == '*')) &&
                 x >= 0) {
            m[i][x] = '*';
            x--;
          }
          x = j;
          while (((m[i][x] <= (48 + f) && m[i][x - 1] == '*') ||
                  (m[i][x + 1] <= (48 + f) && m[i][x] == '*')) &&
                 x <= n) {
            m[i][x] = '*';
            x++;
          }
        }
*/
      }
    }
  }
  printf("\n");
  for (i = 0; i < n; i++) {
    for (j = 0; j < n; j++) {
      printf("%c", m[i][j]);
    }
    printf("\n");
  }
  return 0;
}