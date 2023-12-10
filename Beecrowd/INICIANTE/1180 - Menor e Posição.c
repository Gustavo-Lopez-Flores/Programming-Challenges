#include <stdio.h>
 
int main() {
  int qntd, i, menor, posicao, aux = 0;
  scanf("%d",&qntd);
  int vet[qntd-1];
  for(i=0;i<=qntd-1;i++){
  scanf("%d",&vet[i]);
  if(aux == 0){
  menor = vet[i];  
  aux++;
  }else{
    if(vet[i] < menor){
      menor = vet[i];
      posicao = i;
    }
  }
  }
  printf("Menor valor: %d\n",menor);
  printf("Posicao: %d\n",posicao);
  return 0;
}