#include <stdio.h>
#include <stdlib.h>
#define MAX 50000
int main(){
  int i, j, n, k, x[MAX], soma = 0, cont = 0;
  long int num;
  scanf("%d %d", &n, &k);
  for(i=0;i<n;i++){
    scanf("%d",&x[i]);
  }
  for(i=0;i<n;i++){
    for(j = i; j < n; j++){
      soma += x[j];
      if(soma == k){
        cont++;
      } else if(soma > k){
        break;
      }
    }
    soma = 0;
  }
  printf("%d",cont);
  return 0;
}