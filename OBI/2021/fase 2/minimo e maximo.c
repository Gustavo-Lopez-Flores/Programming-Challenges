#include <stdio.h>
int main()
{
  int i, n, a, b, soma, troca, menor = 0, maior = 0;
  scanf("%d %d %d",&n,&a,&b);
  for(i=a;i<b+1;i++){
    soma = 0;
    troca = i;
    while(troca != 0){
      soma += (troca%10);
      troca /= 10;
    }
    if(soma == n){
      if(menor == 0 && maior == 0){
        menor = i;
        maior = i;            
      }else{
        menor = i < menor? i: menor;
        maior = i > maior? i: maior;          
      }
    }
  }
  printf("%d\n%d\n",menor,maior);  
  return 0;
}