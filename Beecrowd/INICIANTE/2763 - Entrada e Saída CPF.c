#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAM 15
int main()
{
  char cpf[TAM];
  char *pt;
  while(scanf(" %s", cpf) != EOF){
    pt = strtok(cpf, ".-");
    while(pt){
        printf("%s\n", pt);
        pt = strtok(NULL, ".-");
    }  
  }
  return 0;
}