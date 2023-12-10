#include <stdio.h>
#include <stdlib.h>
#define MAX 1000
int main()
{
  int i, j, n, m, soma, menor, mat[MAX][MAX];
  scanf("%d %d", &n, &m);
  for(i = 0; i < n; i++){
    for(j = 0; j < m; j++){
      scanf("%d",&mat[i][j]);
    }
  }

  for(j = 0; j < m; j++){
    soma = 0;
    for(i = 0; i < n; i++){
      soma += mat[i][j];
    }
    if(j == 0){
      menor = soma;
    }else{
      if(soma < menor){
        menor = soma;
      }
    }
  }
  printf("%d\n",menor);
  return 0; 
}