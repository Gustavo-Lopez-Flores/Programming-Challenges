#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
  int n, d, a, passos;
  scanf("%d %d %d", &n, &d, &a);
  if(d > a){
    passos = d - a;    
  }else{
    passos = (n - a) + d;        
  }
  printf("%d\n",passos);
  return 0; 
}