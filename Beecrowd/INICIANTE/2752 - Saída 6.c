#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAM 50
int main()
{
  char palavra[TAM+1] = "AMO FAZER EXERCICIO NO URI";
  printf("<%s>\n",palavra);
  printf("<%30s>\n",palavra);
  printf("<%.20s>\n",palavra);
  printf("<%-20s>\n",palavra);
  printf("<%-30s>\n",palavra);
  printf("<%.30s>\n",palavra);
  printf("<%30.20s>\n",palavra);
  printf("<%-30.20s>\n",palavra);
  return 0;
}