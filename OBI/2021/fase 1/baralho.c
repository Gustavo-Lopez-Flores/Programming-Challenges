#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAM 156
#define NAIPE 4
#define CARTA 14
int main(){
  char baralho[TAM], num[3];
  int i, j, soma, cartas[NAIPE][CARTA] = {0};
  scanf("%s",baralho);
  for(i=0;i<strlen(baralho);i++){
    if(baralho[i+2] == 'C'){
      num[0] = baralho[i];
      num[1] = baralho[i+1];
      num[2] = '\0';
      cartas[0][atoi(num)]++;
    }else if(baralho[i+2] == 'E'){
      num[0] = baralho[i];
      num[1] = baralho[i+1];
      num[2] = '\0';
      cartas[1][atoi(num)]++;
    }else if(baralho[i+2] == 'U'){
      num[0] = baralho[i];
      num[1] = baralho[i+1];
      num[2] = '\0';
      cartas[2][atoi(num)]++;
    }else if(baralho[i+2] == 'P'){
      num[0] = baralho[i];
      num[1] = baralho[i+1];
      num[2] = '\0';
      cartas[3][atoi(num)]++;
    }    
  }
  for(i=0;i<NAIPE;i++){
    soma = 0;    
    for(j=1;j<CARTA;j++){
      if(cartas[i][j] > 1){
        printf("erro\n");
        soma = -1;
        break;
      }else if(cartas[i][j] == 1){
        soma++;
      }
    }
    if(soma != -1){
      printf("%d\n",13-soma);      
    }
  }
  return 0;
}