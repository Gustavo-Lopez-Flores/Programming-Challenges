#include <stdio.h>
#include <stdlib.h>

int somarDigitos(int numero);

int main() {
  int i, n, m, s, num, aux=0;
  scanf("%d%d%d",&n,&m,&s);
  for(i = n; i <= m; i++){
    if((somarDigitos(i)) == s){
      num = i;
      if(aux == 0){
        aux = 1;      
      }
    }
  }
  if(aux == 0){
    printf("-1\n");
  }else{
    printf("%d\n", num);
  }
  return 0;
}

int somarDigitos(int numero) {
    int soma = 0;
    while (numero != 0) {
        soma   += numero % 10;
        numero  = numero / 10;
    }
    return soma;
}
