#include <stdio.h>
#include <stdlib.h>
#define TAM 5

typedef struct{
    int cartas[TAM];
}baralho;

int main()
{
  int i, c = 0, d = 0;
  baralho b;
  for(i = 0; i < 5; i++){
    scanf("%d", &b.cartas[i]);      
  }
  for(i = 0; i < 4; i++){
    c = b.cartas[i+1] >= b.cartas[i] ? c + 1: c + 0;
    d = b.cartas[i+1] <= b.cartas[i] ? d + 1: d + 0;
  }
  if(c == 4){
    printf("C\n");
  }else if(d == 4){
    printf("D\n");
  }else{
    printf("N\n");
  }
  return 0; 
}