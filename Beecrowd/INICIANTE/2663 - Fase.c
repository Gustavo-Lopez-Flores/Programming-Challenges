#include <stdio.h>
#include <stdlib.h>
#define MAX 1000
int compar(const void * a, const void * b){
  if(*(int*)a == *(int*)b){
    return 0;
  }else if(*(int*)a < *(int*)b){
    return 1;
  }else{
    return -1;
  }
}
int main(){
  int i, n, k, maior, cont = 0, aux, competidor[MAX];
  scanf("%d%d",&n,&k);
  for(i=0;i<n;i++){
    scanf("%d",&competidor[i]);
  }
  qsort(competidor,n,sizeof(int),compar);
  for(i=0;i<n;i++){
    if(cont < k){
      cont++;
      aux = i;
    }else{
      if(competidor[i] == competidor[aux]){
        cont++;
      }else{
        break;
      }
    }
  }
  printf("%d\n",cont);
  return 0;
}