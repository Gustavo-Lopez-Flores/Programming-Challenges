#include <stdio.h>
#include <stdlib.h>
/*
typedef struct{
    int p[MAX];
}voo;
*/
int main()
{
  int i, num, divs = 0;
  scanf("%d",&num);
  for(i = 1; i <= num; i++){
    if(num % i == 0){
      divs++;
    }
  }
  printf("%d\n",divs);
  return 0; 
}