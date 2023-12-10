#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 1000
int main() {
  int i, n, t = 0;
  char s[MAX];
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%s",s);
    if(strstr(s,"CD") == NULL){
      t++;
    } 
  }
  printf("%d\n",t);
  return 0;
}