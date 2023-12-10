#include <stdio.h>
#include <stdlib.h>
#define MAX 100000
int main(){
  int i, j, qntd, p[MAX], soma = 0;
  scanf("%d",&qntd);
  for(i=0;i<qntd;i++){
    scanf("%d",&p[i]);
  }
  for(i=0;i<qntd;i++){
    if(p[i] == 0){
      for(j=i;j>-1;j--){
        if(p[j]!=0){
          p[j]=0;
          break;
        }
      }     
    }
  }
  for(i=0;i<qntd;i++){
    soma+=p[i];    
  }
  printf("%d\n",soma);
  return 0;
}