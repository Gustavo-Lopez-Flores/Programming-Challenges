#include <stdio.h>

void calculo(int n1, int n2, float n3, float n4);

int main() {
  int i, amount, n1, n2;
  float n3, n4;
  scanf("%d", &amount);
  for(i=1;i<=amount;i++){
    scanf("%d %d %f %f",&n1,&n2,&n3,&n4);
    calculo(n1,n2,n3,n4);
  }
  return 0;
}

void calculo(int n1, int n2, float n3, float n4) {
  int anos = 0;
    while(1 == 1){
      n1 = n1 + (double)((n1 * n3)/100);
      n2 = n2 + (double)((n2 * n4)/100);
      anos++;
      if(n1 > n2 || anos > 100){
          if(anos > 100){
            printf("Mais de 1 seculo.\n");        
          }else{
            printf("%d anos.\n",anos); 
          }
          break;
      }
    }
  return;
}