#include <stdio.h>
#include <stdlib.h>
int main(){
  int a, b, c;
  scanf("%d %d",&a,&b);
  c = abs(a-b) + b;
  printf("%d\n",c);
  return 0;
}