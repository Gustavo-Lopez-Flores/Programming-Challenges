#include <stdio.h>
#include <stdlib.h>
int main() {
  char p[50], l;
  long long int n, c = 0, b = 0;
  scanf(" %llu",&n);
  while(n!=0){
    scanf(" %s %c", p, &l);
    if(l == 'F'){
      b++;
    }else{
      c++;
    }
    n--;
  }
  printf("%llu carrinhos\n",c);
  printf("%llu bonecas\n",b);
  return 0;
}