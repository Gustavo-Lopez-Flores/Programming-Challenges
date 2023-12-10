#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#define MAX 7
#define TAM 20
int main() {
  int i, t, c, n[MAX];
  char suco[MAX][TAM];
  while(1){
    scanf("%d",&t);
    if(t==0)
      break;
    c=0;
    for(i=0;i<t;i++){
      scanf(" %d %[^\n]",&n[i],suco[i]);
    }
    for(i=0;i<t;i++){
      if(strcmp(suco[i],"suco de laranja") == 0){
        c += (n[i]*120);  
      }else if(strcmp(suco[i],"morango fresco") == 0 || strcmp(suco[i],"mamao") == 0){
        c += (n[i]*85);  
      }else if(strcmp(suco[i],"goiaba vermelha") == 0){
        c += (n[i]*70);  
      }else if(strcmp(suco[i],"manga") == 0){
        c += (n[i]*56);  
      }else if(strcmp(suco[i],"laranja") == 0){
        c += (n[i]*50);  
      }else if(strcmp(suco[i],"brocolis") == 0){
        c += (n[i]*34);  
      } 
    }
    if(c >= 110 && c <= 130){
      printf("%d mg\n",c);
    }else if(c < 110){
      c = abs(c-110);
      printf("Mais %d mg\n",c);
    }else{
      c = abs(c-130);
      printf("Menos %d mg\n",c);
    }
  }
  return 0;
}