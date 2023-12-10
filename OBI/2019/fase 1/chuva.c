#include <stdio.h>
#include <stdlib.h>
#define MAX 500
int main()
{
  int i, j, n, m, x;
  char mat[MAX][MAX];
  scanf("%d %d\n", &n, &m);
  for(i = 0; i < n; i++){
    for(j = 0; j < m; j++){
      scanf(" %c", &mat[i][j]);
    }
  }
  for(i = 0; i < n; i++){
    for(j = 0; j < m; j++){
      if(mat[i][j] == 'o' || (mat[i][j] == '.' && mat[i-1][j] == 'o')){
        x = j;
        while(mat[i+1][x] == '#' && x >=0){
          mat[i][x] = 'o';
          mat[i][x-1] = 'o';
          x--;
        }
        x = j;
        while(mat[i+1][x] == '#' && x <=m){
          mat[i][x] = 'o';
          mat[i][x+1] = 'o';
          x++;
        }
        if(mat[i+1][j] == '.'){
          mat[i+1][j] = 'o';
        }
        mat[i][j] = 'o';            
      } 
    }
  }
  printf("\n");
  for(i = 0; i < n; i++){
    for(j = 0; j < m; j++){
      printf("%c", mat[i][j]);
    }
    printf("\n");
  }
  return 0;
}