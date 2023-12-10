#include <stdio.h>
#include <stdlib.h>
#define MAX 50000
int main(){
  int v, s; 
  scanf("%d", &v);
  if(v < 7){
    s = (v-2)-3;
  }else{
    if((v-2) % 6 == 0){
      s = 1;
    }else if((v-2) % 7 == 0){
      s = 2;
    }else if((v-2) % 8 == 0){
      s = 3;
    }
  }
  printf("%d\n",s);
  return 0;
}