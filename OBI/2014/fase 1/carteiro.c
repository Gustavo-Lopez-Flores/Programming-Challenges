#include <stdio.h>
#include <stdlib.h>
#define MAX 45000

typedef struct{
    int casas[MAX], encomendas[MAX];
}endereco;

int main()
{
  int i, n, m, posicao = 1, aux = 1, tempo = 0;
  endereco e;
  scanf("%d %d", &n, &m);
  for(i = 1; i <= n; i++){
    scanf("%d", &e.casas[i]);      
  }
  for(i = 1; i <= m; i++){
    scanf("%d", &e.encomendas[i]);      
  }
  while(1){
    if(aux == m+1){
      break;
    }else{
      if(e.encomendas[aux] > e.casas[posicao]){
        tempo++;
        posicao++;
      }else if(e.encomendas[aux] < e.casas[posicao]){
        tempo++;          
        posicao--;
      }else if(e.encomendas[aux] == e.casas[posicao]){
        aux++;
      }
    }
  }
  printf("%d",tempo);
  return 0; 
}