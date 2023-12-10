#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAM 50
int main()
{
  int a;
  float b;
  char c, d[TAM+1];
  while(scanf(" %d %f %c %[^\n]",&a,&b,&c,d) != EOF){
    printf("%d%f%c%s\n",a,b,c,d);
    printf("%d\t%f\t%c\t%s\n",a,b,c,d);
    printf("%10d%10.6f%10c%10s\n",a,b,c,d);
  }
  return 0;
}