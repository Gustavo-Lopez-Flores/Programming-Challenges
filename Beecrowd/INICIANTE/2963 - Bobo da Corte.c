#include <stdio.h>
#include <stdlib.h>
#define MAX 10000
int compar(const void *a, const void *b){
  if(*(int*)a == *(int*)b){
    return 0;
  }else if(*(int*)a < *(int*)b){
    return 1;
  }else{
    return -1;
  }
}
int main() {
  int i, n, p, v[MAX];  
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&v[i]);
  }
  p = v[0];
  qsort(v,n,sizeof(int),compar);
  if((v[0] == v[1] && p == v[0]) || (p == v[0] && v[0] > v[1])){
    printf("S\n");
  }else{
    printf("N\n");
  }
  return 0;
}