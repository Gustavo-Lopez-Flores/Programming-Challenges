#include <stdio.h>
#include <stdlib.h>
int main()
{
  int ia, ib, fa, fb, passos;
  scanf("%d %d %d %d", &ia, &ib, &fa, &fb);
  if((ia == 0 && ib == 0 && fa == 0 && fb == 1)||(ia == 1 && ib == 0 && fa == 1 && fb == 1)||(ia == 1 && ib == 1 && fa == 1 && fb == 0)){
    passos = 2;
  }else{
    passos = 1;
  }
  printf("%d\n",passos);
  return 0; 
}