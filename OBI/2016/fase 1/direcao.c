#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 6
int main()
{
  int angulo;
  char l[MAX], m[MAX];
  scanf("%s %s", l, m);
  if(strcmp(l, "norte") == 0){
    if(strcmp(m, "sul") == 0){
      angulo = 180;
    }else{
      angulo = 90;
    }  
  }else if(strcmp(l, "sul") == 0){
    if(strcmp(m, "norte") == 0){
      angulo = 180;
    }else{
      angulo = 90;
    }
  }else if(strcmp(l, "leste") == 0){
    if(strcmp(m, "oeste") == 0){
      angulo = 180;
    }else{
      angulo = 90;
    }
  }else if(strcmp(l, "oeste") == 0){
    if(strcmp(m, "leste") == 0){
      angulo = 180;
    }else{
      angulo = 90;
    }
  }
  printf("%d\n",angulo);
  return 0; 
}