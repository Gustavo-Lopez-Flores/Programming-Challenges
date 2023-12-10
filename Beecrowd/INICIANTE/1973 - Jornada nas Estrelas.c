#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define MAX 1000000
int main()
{
  long long int i, qnt, maior = 0, fork = 0, sum = 0, star[MAX];
  scanf("%llu",&qnt);
  for(i=0;i<qnt;i++){
    scanf("%llu",&star[i]);          
    sum += star[i];
  }
  i = 0;
  while(1){
    if(star[i] > 0 && (i >=0 && i < qnt)){
      maior = i > maior? i: maior;
      if(star[i] % 2 == 0){
        star[i]--;
        i--;
      }else{
        star[i]--;
        i++;
      }
      fork++;
    }else{
      break;
    }
  }
  sum -= fork;
  printf("%llu %llu\n", maior+1, sum);
  return 0;
}