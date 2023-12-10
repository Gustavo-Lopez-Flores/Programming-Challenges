#include <stdio.h>
#include <stdlib.h>
#define MAX 100
int main()
{
  int i, n, c, m, x, y, falta = 0, t[MAX];
  scanf("%d %d %d",&n,&c,&m);
  for(i=0;i<n;i++){
    t[i] = 0;
  }
  for(i=0;i<c;i++){
    scanf("%d",&x);
    t[x]++;
  }
  for(i=0;i<m;i++){
    scanf("%d",&y);  
    t[y] = 0;
  }
  for(i=0;i<n;i++){
    if(t[i] != 0){
      falta++;
    }
  }
  printf("%d",falta);
  return 0;
}