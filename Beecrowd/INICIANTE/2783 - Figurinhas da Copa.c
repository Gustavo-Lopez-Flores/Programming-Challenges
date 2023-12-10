#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define MAX 100
int main() {
  int i, n, c, m, s, num, fig[MAX+1] = {0};
  scanf("%d%d%d", &n, &c, &m);
  for(i=0;i<c;i++){
    scanf("%d",&num);
    fig[num]++;
  }
  for(i=0;i<m;i++){
    scanf("%d",&num);
    fig[num]=0;
  }
  s = 0;
  for(i=0;i<MAX;i++){
    if(fig[i] != 0){
      s++;
    }
  }
  printf("%d\n",s);
  return 0;
}