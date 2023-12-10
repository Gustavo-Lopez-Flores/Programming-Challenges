#include <stdio.h>
#include <stdlib.h>
#define MAX 101
typedef int tipoValor;
int main()
{
  tipoValor i, j, n, m, mA[MAX][MAX] = {0}, mB[MAX][MAX] = {0};
  while(scanf("%d%d",&n,&m) != EOF){
    for(i=1;i<=n;i++){
      for(j=1;j<=m;j++){
        scanf("%d",&mA[i][j]);
      }
    }
    for(i=1;i<=n;i++){
      for(j=1;j<=m;j++){
        if(mA[i][j]==1){
          mB[i][j] = 9;
        }else{
          if(mA[i-1][j] == 1){
            mB[i][j]++;
          }
          if(mA[i][j-1] == 1){
            mB[i][j]++;
          }
          if(mA[i][j+1] == 1){
            mB[i][j]++;
          }
          if(mA[i+1][j] == 1){
            mB[i][j]++;
          }
        }
      }
    }
    for(i=1;i<=n;i++){
      for(j=1;j<=m;j++){
        printf("%d",mB[i][j]);
        mA[i][j] = 0;
        mB[i][j] = 0;
      }
      printf("\n");
    }
  }
  return 0;
}