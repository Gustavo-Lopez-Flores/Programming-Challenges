#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAM 10
int main()
{
  int i;
  char data[TAM];
  char mat[3][3];
  char *pt;
  while(scanf(" %s", data) != EOF){
    pt = strtok(data, "/");
    i = 0;
    while(pt){
      strcpy(mat[i],pt);
      pt = strtok(NULL, "/");
      i++;
    }
    printf("%s/%s/%s\n",mat[1],mat[0],mat[2]);
    printf("%s/%s/%s\n",mat[2],mat[1],mat[0]);
    printf("%s-%s-%s\n",mat[0],mat[1],mat[2]);
  }
  return 0;
}