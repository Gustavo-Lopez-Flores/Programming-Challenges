#include <stdio.h>
#include <stdlib.h>
#define MAX 1000
int main(){
  int i, j, n, c, l, rep, p[MAX], in[MAX], x[MAX];
  scanf("%d %d",&n,&c);
  l = 0;
  for(i=0;i<c;i++){
    scanf("%d %d",&p[i],&in[i]); 
    for(j=0;j<in[i];j++){
      scanf("%d",&x[l]);
      l++;
    }
  }
  for(i=0;i<c;i++){
    rep = 0;
    for(j=0;j<l;j++){
      if(p[i] == x[j]){
        rep++;
      }
    }
    if(rep == 0){
      printf("%d\n",p[i]);
    }
  }
  return 0;
}