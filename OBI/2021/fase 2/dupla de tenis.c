#include <stdio.h>
#include <stdlib.h>
#define MAX 4
int main(){
  int i, j, troca, menor, v[MAX];
  for(i=0;i<MAX;i++){
    scanf("%d",&v[i]);
  }
  for(i=0;i<MAX-1;i++){
    for(j=i+1;j<MAX;j++){
      if(v[i] > v[j]){
        troca = v[i];
        v[i] = v[j];
        v[j] = troca;
      }
    }
  }
  menor = abs((v[0]+v[3])-(v[1]+v[2]));
  printf("%d",menor);
  return 0;
}