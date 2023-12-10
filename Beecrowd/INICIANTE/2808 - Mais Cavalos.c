#include <stdio.h>
#include <stdlib.h>
int main() {
  int n1, n2;
  char l1, l2;
  scanf("%c%d %c%d", &l1, &n1, &l2, &n2);
  if((l2 == (l1-2)) && ((n2 == (n1+1)) || n2 == (n1-1))){
    printf("VALIDO\n");  
  }else if((l2 == (l1-1)) && ((n2 == (n1+2)) || n2 == (n1-2))){
    printf("VALIDO\n");  
  }else if((l2 == (l1+1)) && ((n2 == (n1+2)) || n2 == (n1-2))){
    printf("VALIDO\n");  
  }else if((l2 == (l1+2)) && ((n2 == (n1+1)) || n2 == (n1-1))){
    printf("VALIDO\n");  
  }else{
    printf("INVALIDO\n");
  }
  return 0;
}