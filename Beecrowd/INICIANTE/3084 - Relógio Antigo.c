#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main() {
  int i, ah, am, h, m;
  while(scanf(" %d%d", &ah, &am) != EOF){
    h = (ah)/30;
    m = (am)/6;
    if(m == 60){
      m = 0;
      h++;
    }
    printf("%.2d:%.2d\n",h,m);
  }
  return 0;
}