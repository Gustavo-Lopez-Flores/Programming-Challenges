#include <stdio.h>
#include <stdlib.h>
#define MAX 1000
typedef struct{
    int matriz[MAX][MAX], l[2*MAX], c[2*MAX];
}mat;

int main()
{
  mat m;
  char s;
  int i, j, a, qntd, l = 0, c = 0;
  scanf("%d\n",&qntd);
  for(i = 0; i < qntd; i++){
    for(j = 0; j < qntd; j++){
      scanf(" %c",&s);
      if(s == '0'){
        m.matriz[i][j] = 0;
        m.l[l] = i;
        m.c[c] = j;
        l++;
        c++;
      }else{
        m.matriz[i][j] = 1;
      }
    }
  }
  for(i = 0; i < qntd; i++){
    for(j = 0; j < qntd; j++){
      if(m.matriz[i][j] != '0'){
        m.matriz[i][j] = abs(m.l[0]-i)+abs(m.c[0]-j);
        for(a = 1; a < l; a++){
          if((abs(m.l[a]-i)+abs(m.c[a]-j)) < m.matriz[i][j]){
            m.matriz[i][j] = abs(m.l[a]-i)+abs(m.c[a]-j);                      
          }
        }
      }
    }
  }
  printf("\n");
  for(i = 0; i < qntd; i++){
    for(j = 0; j < qntd; j++){
      printf("%d",m.matriz[i][j]);  
    }
      printf("\n");
  }

  return 0; 
}