#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100
int main()
{
  int n, i, t = 0, aberto = 0, fechado = 0;
  char l;
  scanf("%d\n", &n);
  while(t != n){
    scanf("%c",&l);
    if(l == '\n'){
      t++;
    }else{
      if(l == '{'){
        aberto++;
      }else if(l == '}'){
        fechado++;
      } 
    }
  }
  if(aberto == fechado){
    printf("S\n");
  }else{
    printf("N\n");
  }
  return 0; 
}