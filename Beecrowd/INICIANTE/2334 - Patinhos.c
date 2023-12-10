#include <stdio.h>
#include <stdlib.h>
int main()
{
  long double p;
  while(1){
    scanf("%LF",&p);
    if(p == -1){
      break;
    }else{
      p = p > 0 ? p-1: 0;  
      printf("%.0LF\n",p);
    }
  }
  return 0;
}