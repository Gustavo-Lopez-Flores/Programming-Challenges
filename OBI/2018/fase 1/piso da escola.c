#include <stdio.h>
#include <stdlib.h>
#define MAX 1000

int main()
{
  int l, c, tp1, tp2, a;
  scanf("%d %d", &l, &c);
  tp1 = (2*(l*c)) - 1 - ((((l-1)*2)+((c-1)*2))/2);
  tp2 = ((l-1)*2)+((c-1)*2); 
  printf("%d\n%d\n",tp1,tp2);
  return 0;
}