#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define MAX 100000
int main() {
  int i, h, m, cnt;
  double soma, media, somatorio, vet[MAX];
  while(scanf("%d%d", &h, &m) != EOF){
    cnt = (h*60)/m;
    soma = 0.0;
    somatorio= 0.0;
    for(i=0;i<cnt;i++){
      scanf("%lf",&vet[i]);
      soma+=vet[i];
    }
    media = (double)(soma/cnt);
    for(i=0;i<cnt;i++){
      somatorio += ((vet[i]-media)*(vet[i]-media));
    }
    somatorio = sqrt(somatorio/(cnt-1));
    printf("%.5lf\n",somatorio);
  }

  return 0;
}