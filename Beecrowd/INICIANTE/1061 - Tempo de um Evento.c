#include<stdio.h>
int main(){
  int diaInicial, horaInicial, minutoInicial, segundoInicial, diaFinal, horaFinal, minutoFinal, segundoFinal;
  scanf("Dia %d", &diaInicial);
  scanf("%d : %d : %d\n", &horaInicial, &minutoInicial, &segundoInicial);
  scanf("Dia %d", &diaFinal);
  scanf("%d : %d : %d", &horaFinal, &minutoFinal, &segundoFinal);
  
  segundoInicial = segundoFinal - segundoInicial;
  minutoInicial = minutoFinal - minutoInicial;
  horaInicial = horaFinal - horaInicial;
  diaInicial = diaFinal - diaInicial;
  
  if (segundoInicial < 0){
    segundoInicial += 60;
    minutoInicial--;
  }  
  if (minutoInicial < 0){
    minutoInicial += 60;
    horaInicial--;
  }  
  if (horaInicial < 0){
    horaInicial += 24;
    diaInicial--;
  }
  
  printf("%d dia(s)\n", diaInicial);
  printf("%d hora(s)\n", horaInicial);
  printf("%d minuto(s)\n", minutoInicial);
  printf("%d segundo(s)\n", segundoInicial);

  return 0;
}