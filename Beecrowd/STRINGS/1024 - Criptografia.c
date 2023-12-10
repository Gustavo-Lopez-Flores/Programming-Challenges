#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 1000
int main()
{
  int i, j, n, aux, cont;
  char troca, palavra[MAX]; 
  scanf("%d", &n);    
  for(j = 0; j < n; j++){
    scanf("\n%[^\n]",palavra);
    aux = strlen(palavra);
    for(i = 0; i < aux; i++){
      if((palavra[i] >= 65 && palavra[i] <= 90) || (palavra[i] >= 97 && palavra[i] <= 122)){
        palavra[i] += 3;
      }
    }
    cont = aux-1;
    for(i = 0; i < aux/2; i++){
      troca = palavra[i];
      palavra[i] = palavra[cont];
      palavra[cont] = troca;
      cont--;
    }
    for(i = aux/2; i < aux; i++){
      palavra[i] -= 1;
    }
    printf("%s\n",palavra);
  }
  return 0;
}