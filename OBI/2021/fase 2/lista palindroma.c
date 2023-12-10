#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define MAX 1000000
int main()
{
  long long int i, n, t = 0, d = 0, s, v[MAX];
  scanf("%llu",&n);
  for(i=0;i<n;i++){
    scanf("%llu",&v[i]);
  }
  for(i=0;i<n/2;i++){
    if(v[i] == v[(n-1)-i]){
      t++;
    }
    d++;
  }
  s = d-t;
  printf("%llu",s);
  return 0;
}