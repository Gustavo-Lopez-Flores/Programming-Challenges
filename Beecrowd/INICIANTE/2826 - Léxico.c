#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MIN 2
#define MAX 20
struct pessoa{
    char nome[20];
};
int comparar (const void *a, const void *b) {
    return strcmp (((struct pessoa *)a)->nome,((struct pessoa *)b)->nome);
}
int main() {
  int i;
   struct pessoa p[MIN];
  for(i=0;i<MIN;i++){
    scanf(" %s",p[i].nome);    
  }
  qsort(p, MIN, sizeof(struct pessoa), comparar);
  for(i=0;i<MIN;i++){
    printf("%s\n",p[i].nome);
  }
  return 0;
}