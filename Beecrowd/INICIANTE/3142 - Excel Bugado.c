#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#define MAX 10
int main() {
  int i, d, total;
  char s[MAX+1];
  while(scanf(" %s", s) != EOF){
    total = 0;
    d = strlen(s);
    if (d > 3){
      printf("Essa coluna nao existe Tobias!\n");
    } else {
      d--;
      for(i=0;i<strlen(s);i++){
        total += (s[i]-64)*pow(26,d);
        d--;
      }
      if (total > 16384){
        printf("Essa coluna nao existe Tobias!\n");
      } else {
        printf("%d\n",total);
      }
    }
  }
  return 0;
}