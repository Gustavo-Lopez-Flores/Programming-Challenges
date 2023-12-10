#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 1001

int main() {
  int i, n, t;
  char s1[MAX], s2[MAX];
  while (scanf(" %d", &n) != EOF) {
    for(i=0; i<n; i++){
      scanf(" %s%s", s1, s2);
      if(strlen(s2) > strlen(s1)){
        printf("nao encaixa\n"); 
      }else{ 
        t = strlen(s1) - strlen(s2);
        strcpy(s1,s1+t); 
        if(strcmp(s1,s2) == 0){
          printf("encaixa\n"); 
        }else{
          printf("nao encaixa\n");      
        }
      }      
    }
  }
  return 0;
}