#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int compar(const void *a, const void *b){
  if(*(int*)a == *(int*)b){
    return 0;
  }else if(*(int*)a < *(int*)b){
    return -1;
  }else{
    return 1;
  }
}
int main() {
  int m, i, f[3];
  scanf("%d%d%d",&m,&f[0],&f[1]);
  f[2] = m - (f[0] + f[1]);
  qsort(f,3,sizeof(int),compar);
  printf("%d\n",f[2]);
  return 0;
}