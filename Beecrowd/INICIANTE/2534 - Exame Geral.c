#include <stdio.h>
#include <stdlib.h>
#define MAX 100
int compar(const void * a, const void * b){
  if(*(int*)a == *(int*)b){
    
  }else if(*(int*)a < *(int*)b){
    return 1;
  }else{
    return -1;
  } 
}
int main() {
  int i, n, q, c, p[MAX];
  while(scanf("%d%d",&n,&q) != EOF){
    for(i=0;i<n;i++){
      scanf("%d", &p[i]);      
    } 
    qsort(p,n,sizeof(int),compar);
    for(i=0;i<q;i++){
      scanf("%d",&c);
      printf("%d\n",p[c-1]);
    }
  }
  return 0;
}