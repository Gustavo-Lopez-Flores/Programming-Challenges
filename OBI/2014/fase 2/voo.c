#include <stdio.h>
#include <stdlib.h>
#define MAX 5

typedef struct{
    int p[MAX];
}voo;

int main()
{
  int i, minutos, fuso, m1, m2;
  voo v;
  for(i = 1; i <= 4; i++){
    scanf("%d", &v.p[i]);      
  }
  m1 = (v.p[2] < v.p[1]) && (v.p[4] < v.p[3]) ? ((24-v.p[1]) + v.p[2]) : v.p[2]-v.p[1];
  m2 = v.p[4]-v.p[3];
  fuso = ((m1+m2)/2) - (m2);
  minutos = abs((m1+m2)/2) * 60;
  printf("%d %d", minutos, fuso);
  return 0; 
}