#include <stdio.h>
#include <stdlib.h>
#define MAX 3
int main() {
  int n, aux, i, j, copos[MAX];
  char l, f;
  scanf(" %d %c",&n,&l);
  if(l == 'A'){
    copos[0] = 1;
    copos[1] = 0;
    copos[2] = 0;
  }else if(l == 'B'){
    copos[0] = 0;
    copos[1] = 1;
    copos[2] = 0;
  }else if(l == 'C'){
    copos[0] = 0;
    copos[1] = 0;
    copos[2] = 1;
  }
  for(i=0;i<n;i++){
    scanf(" %d",&j);
    if(j == 1){
      aux = copos[1];
      copos[1] = copos[0];
      copos[0] = aux;
    }else if(j == 2){
      aux = copos[2];
      copos[2] = copos[1];
      copos[1] = aux;
    }else if(j == 3){
      aux = copos[0];
      copos[0] = copos[2];
      copos[2] = aux;
    }
  }
  for(i=0;i<MAX;i++){
    if(copos[i] == 1){
      printf("%c\n",i+65);
      break;
    }
  }
  return 0;
}