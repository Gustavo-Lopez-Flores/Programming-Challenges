#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 3
#define TAM 15
struct pato{
  int idade;
  char nome[TAM];
};
int compar (const void *x, const void *y) {
    int pri = ((struct pato *)x)->idade;
    int seg = ((struct pato *)y)->idade;
    return (pri - seg);
}
int main() {
  struct pato p[MAX];
  int i;
  strcpy(p[0].nome,"huguinho");
  strcpy(p[1].nome,"zezinho");
  strcpy(p[2].nome,"luisinho");
  scanf("%d%d%d",&p[0].idade,&p[1].idade,&p[2].idade);
  qsort(p,MAX,sizeof(struct pato),compar);  
  printf("%s\n",p[1].nome);
  return 0;
}