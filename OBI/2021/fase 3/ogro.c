#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100
int main(){
  int i, n, me, md = 0;
  scanf("%d",&n);
  if(n>5){
    md = n%5;    
  }
  me = n - md;
  if(me > 0){
    for(i=0;i<me;i++){
      printf("I");
    }    
    printf("\n");  
  }else{
    printf("*\n");
  }
  if(md > 0){
    for(i=0;i<md;i++){
      printf("I");
    }    
    printf("\n");  
  }else{
    printf("*\n");
  }
  return 0;
}