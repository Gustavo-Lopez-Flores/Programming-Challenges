#include <stdio.h>
#include <stdlib.h>
int main() {
  int i, n, s, *vet, aux, soma, cont=0;
  scanf("%d%d",&n, &s);
  vet = malloc(n*sizeof(int));
  for(i = 0; i < n; i++){
    scanf("%d", &vet[i]);
  }
  for(i = 0; i < n; i++){
    aux = i;
    soma = 0;
    while(aux < n){
      soma += vet[aux];
      aux++;
      if(soma < s){
        continue;
      }else if(soma == s){
        cont++;
      }else{
        break;
      }
    }
  }
  free(vet);
  printf("\n%d\n",cont);
  return 0;
}