#include <stdio.h>
#include <stdlib.h>
#define MAX 1000

int main()
{
  int i, j, n, m, s, u, v, p, mat[MAX][MAX], mn, ma, aux = 0;
  scanf("%d %d",&n,&m);
  for(i = 1; i < n+1; i++){
    for(j = 1; j <i+1; j++){
      mat[i][j] = 0;
    }  
  }
  for(i=0;i<m;i++){
    scanf("%d %d %d", &u, &v, &p);
    mat[u][v] = p;
    mat[v][u] = p;
  }
  scanf("%d",&s);
  for(i = 1; i < n+1; i++){
    if(i != s){
      for(j = 1; j <i+1; j++){
        if(aux == 0 && mat[i][j] != 0){
          mn = mat[i][j];
          ma = mat[i][j];
          aux++;
        }else{
          if(mat[i][j] < mn && mat[i][j] != 0){
            mn = mat[i][j];
          }else if(mat[i][j] > ma && mat[i][j] != 0){
            ma = mat[i][j];
          }          
        }  
      }
    }  
  }
  printf("%d",(ma-mn));
  return 0;
}