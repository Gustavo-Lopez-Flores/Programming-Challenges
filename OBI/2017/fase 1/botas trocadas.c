#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 30

typedef struct{
  int e[MAX], d[MAX];
}numero;

int main()
{
  int i, qntd, num, pares = 0;
  char lado;
  numero n;
  for(i = 0; i < MAX; i++){
    n.e[i] = 0;
    n.d[i] = 0;
  }
  scanf("%d",&qntd);
  for(i = 0; i < qntd; i++){
    scanf("%d %c", &num, &lado);
    if(lado == 'D'){
      n.d[num-30]++;
    }else{
      n.e[num-30]++;
    }
  }
  for(i = 0; i < MAX; i++){
    if(n.e[i] == n.d[i] && n.d[i] > 0 && n.e[i] > 0){
      pares++;
    }
  }
  printf("%d\n",pares);
  return 0; 
}