#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#define MAX 1000

int main(void) {
  int i, n, media, soma = 0, p[MAX];
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&p[i]);
    soma += p[i];
  }
  media = (int)soma/n;
  for(i=0;i<n;i++){
    if(p[i] > media){
      p[i] = abs(p[i]-media)*-1;  
    }else{
      p[i] = abs(p[i]-media);
    }
    printf("%d\n",p[i]);
  }
  return 0;
}