#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define TAM 100
int main()
{
  int i, n, m, s, x, f[TAM+1];
  while(scanf("%d",&n) != EOF){
    scanf("%d",&m);
    for(i=1;i<=n;i++){
      f[i]=0;
    }
    for(i=0;i<m;i++){
      scanf("%d",&x);
      f[x]++;
    }
    s=0;
    for(i=1;i<=n;i++){
      if(f[i]==0){
        s++;
      }
    }
    printf("%d\n",s);      
  }
  return 0;
}