#include <stdio.h>
#include <stdlib.h>
int main() {
  int n, i, num, total, teste = 1;
  char sinal = '*';
  while(n != 0){
    scanf(" %d", &n);
    if(n == 0){
      break;
    }
    scanf("%d",&total);
    for(i=1;i<n;i++){
      scanf("%c%d", &sinal, &num);
      if(sinal == '+'){
        total += num;
      }else{
        total -= num;
      }
    }
    printf("Teste %d\n",teste);
    printf("%d\n\n",total);
    teste++;
  }
  return 0;
}