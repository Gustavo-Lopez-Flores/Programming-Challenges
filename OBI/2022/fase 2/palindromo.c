#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <time.h>
#define MAX 600
int main()
{
  int i, j, k, m, n, num, tM = 0, soma = 0;
  char palindromo[MAX], pA[MAX], pL[MAX];
  scanf("%d",&num);
  scanf(" %s",palindromo);
  for(i = 0; i < num; i++){
      m = num;
      while(i <= m){
        soma = 0;
        for(k = i, j = 0; k <= m; k++, j++){
          pA[j] = palindromo[k];
          pL[j] = palindromo[m-j];
          if(k == m){
            pA[j+1] = '\0';
            pL[j+1] = '\0';
          }
        }
        if(strcmp(pA,pL)==0){
          if(tM == 0){
            tM = strlen(pL);
          }else if(strlen(pL) > tM){
            tM = strlen(pL);
          }
          break;
        }
        m--;
      }    
  }
  printf("%d\n",tM);
  return 0;
}
