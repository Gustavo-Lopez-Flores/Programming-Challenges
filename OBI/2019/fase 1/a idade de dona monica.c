#include <stdio.h>
#include <stdlib.h>
#define MAX 4
int main()
{
  int m, i, j, troca, f[MAX];
  scanf("%d", &m);
  for(i = 1; i < MAX-1; i++){
    scanf("%d", &f[i]);
  }
  f[3] = m - (f[1]+f[2]);
  for(i=1;i<MAX;i++){
    for(j=1;j<MAX;j++){
      if(f[i] > f[j]){
        troca = f[i];
        f[i] = f[j];
        f[j] = troca;
      }
    }
  }
  printf("%d\n",f[1]);
  return 0;
}