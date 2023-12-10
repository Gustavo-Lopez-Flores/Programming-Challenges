#include <stdio.h>
#include <stdlib.h>
#define MAX 6
int main(){
  int i, j, v = 0;
  char  p[MAX];
  for(i=0;i<MAX;i++){
    scanf(" %c",&p[i]);
  }
  for(i=0;i<MAX;i++){
    if(p[i] == 'V'){
      v++;
    }
  }
  if(v == 1 || v == 2){
    printf("1\n");
  }else if(v == 3 || v == 4){
    printf("2\n");
  }else if(v == 5 || v == 6){
    printf("3\n");
  }else{
    printf("-1\n");
  }
  return 0;
}