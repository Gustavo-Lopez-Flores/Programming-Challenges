#include <stdio.h>
#include <stdlib.h>
#define MAX 3

int compar(const void * a, const void * b){
  if (*(int*)a > *(int*)b) {
    return 1;
  } else if (*(int*)a < *(int*)b) {
    return -1;
  } else {
    return 0;
  }
}

int main() {
  int i, n, cont=0, p[MAX];
  scanf(" %d", &n);
  
  for(i=0;i<MAX;i++){
    scanf(" %d", &p[i]);  
  }
  
  qsort(p, MAX, sizeof(int), compar);
  
  for(i=0;i<MAX;i++){
    if((n-p[i])>=0){
      n-=p[i];
      cont++;
    }  
  }

  printf("\n%d\n", cont);
  return 0;
}