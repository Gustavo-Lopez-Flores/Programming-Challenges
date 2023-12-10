#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int conta(long long int n){
  int qntd = 0;
  while(n!=0){
    qntd += 1;
    n/=10;
  }
  return qntd;
}
int main()
{
  int aux;
  long long int num, novo = 0;
  scanf("%llu",&num);
  aux = conta(num) - 1;
  if(num%10 == 0)
    printf("0");    
  while(num != 0){
    novo += ((num%10)*pow(10,aux));
    num /= 10;
    aux--;
  }
  printf("%llu\n",novo);    
  return 0;
}