#include <stdio.h>
#include <stdlib.h>
#define MAX 1000
int main(){
  int i, n, p, m, q1 = 0, q2 = 0, t[MAX];
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&t[i]);
  }
  scanf("%d %d",&p,&m);
  for(i=0;i<n;i++){
    if(t[i] == 1){
      q1++;
    }else{
      q2++;
    }   
  }
  if(q1 == p && q2 == m){
    printf("S\n");
  }else{
    printf("N\n");
  }
  return 0;
}