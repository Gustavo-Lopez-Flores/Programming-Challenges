#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 50

int main() {
  int qntd, num, i, j;
  char palavra[MAX];
  scanf("%d",&qntd);
  for(i=0;i<qntd;i++){
    scanf(" %s",palavra);
    scanf(" %d", &num);
    for(j = 0; j < strlen(palavra); j++){
      palavra[j]-=num;
      if(palavra[j] < 65){
        palavra[j] = 91 - abs(65-palavra[j]);        
      }
    }
    printf("%s\n",palavra);    
  }
  return 0;
}