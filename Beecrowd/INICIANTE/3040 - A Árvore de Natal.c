#include <stdio.h>
#include <stdlib.h>
int main() {
  long long int n, h, d, g;
  scanf(" %llu",&n);
  while(n!=0){
    scanf(" %llu %llu %llu", &h, &d, &g);
    if((h >= 200 && h <= 300) && (d >= 50) && (g >= 150)){
      printf("Sim\n"); 
    }else{
      printf("Nao\n"); 
    }
    n--;
  }
  return 0;
}