#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#define TAM 50
int main()
{
  char a[TAM] = "Ro'b'er";
  char h[TAM] = "to\\/";
  char b[TAM] = "(._.) ( l: ) ( .-. ) ( :l ) (._.)";
  char c[TAM] = "(^_-) (-_-) (-_^)";
  char d[TAM] = "(";
  char e ='_';
  char f[TAM] = ") ('.')";
  char g = '"';
  printf("%c%s\t%s%c\n",g,a,h,g);
  printf("%s\n",b);
  printf("%s\n",c);
  printf("%s%c%c%c%s\n",d,g,e,g,f);
  return 0;
}