#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAM 200
int main()
{
  char frase[TAM+1];
  char *pt;
  while(scanf(" %[^\n]", frase) != EOF){
    pt = strtok(frase, ",");
    while(pt){
      printf("%s\n",pt);
      pt = strtok(NULL, ",");
    }
  }
  return 0;
}