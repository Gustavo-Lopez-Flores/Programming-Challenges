#include <stdio.h>
#include <stdlib.h>
int main() {
  int i, j, n, m, c;
  int *vetor, *operacoes;
  
  scanf(" %d %d", &n, &m);
  
  vetor = (int*) malloc(n * sizeof(int));
  operacoes = (int*) malloc(m * sizeof(int));
  
  for(i=0; i<n; i++){
    scanf(" %d",&vetor[i]);     
  }
  
  for(i=0; i<m; i++){
    scanf(" %d",&operacoes[i]);     
  }
  
  for(i=0; i<m; i++){
    c = vetor[(operacoes[i]-1)];
    for(j=0; j<n; j++){
      if(abs((j+1)-(operacoes[i])) <= c){
        if(vetor[j]>0){
          vetor[j]--;                    
        }
      }    
    }
  }
  for(j=0; j<n; j++){
    printf("%d ", vetor[j]);     
  }
  free(vetor);
  free(operacoes);        
  printf("\n");
  return 0;
}