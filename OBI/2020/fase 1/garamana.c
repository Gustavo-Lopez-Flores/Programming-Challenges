#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100
#define ALF 123
int main(){
  int i, j, troca, s = 0, ast = 0;
  char a[MAX], p[MAX];
  scanf("%s\n%s",p,a);
  for(i=0;i<strlen(p)-1;i++){
    for(j=i+1;j<strlen(p);j++){
      if(p[i] > p[j]){
        troca = p[i];
        p[i] = p[j];
        p[j] = troca;
      }
    }
  }
  for(i=0;i<strlen(p)-1;i++){
    for(j=i+1;j<strlen(p);j++){
      if(a[i] > a[j]){
        troca = a[i];
        a[i] = a[j];
        a[j] = troca;
      }
    }
  }
  for(i=0;i<strlen(p);i++){
    for(j=i;j<strlen(p);j++){
      if(p[i] == a[j]){
        s++;
        break;
      }
    }
  }
  for(i=0;i<strlen(p);i++){
    if(a[i] == '*'){
      ast++;
    }
  }
  if((s+ast) == (strlen(p))){
  printf("S\n");
  }else{
  printf("N\n");    
  }
  return 0;
}