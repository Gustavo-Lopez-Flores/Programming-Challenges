#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAM 100
int main()
{
  char a[TAM+1], b[TAM+1], c[TAM+1];
  while(scanf(" %[^\n] %[^\n] %[^\n]",a,b,c) != EOF){
    printf("%s%s%s\n",a,b,c);
    printf("%s%s%s\n",b,c,a);
    printf("%s%s%s\n",c,a,b);
    printf("%.10s%.10s%.10s\n",a,b,c);
  }
  return 0;
}