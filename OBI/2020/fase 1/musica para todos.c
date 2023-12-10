#include <stdio.h>
#include <stdlib.h>
#define MAX 1000
int main(){
  int i, n, m, c, df, numT = 0, a[MAX], d[MAX];
  scanf("%d %d %d",&n,&m,&c);
  for(i=0;i<n;i++){
    scanf("%d %d",&a[i],&d[i]);    
  }
  while(1){
    df = 0;
    for(i=0;i<n;i++){
      if(c == d[i]){
        c = a[i];
        numT++;
        df++;
      }
    }      
    if(numT > m){
      numT = -1;
      break;
    }
    if(df == 0){
      break;
    }
  }
  printf("%d\n",numT);
  return 0;
}