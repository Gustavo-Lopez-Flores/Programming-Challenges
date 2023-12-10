#include <stdio.h>
 
int main() {
  int i, num, all = 0, amount, aFrog = 0, aBunny = 0, aMouse = 0;
  float pFrog, pBunny, pMouse;
  char type;
  scanf("%d",&amount);  
  for(i=1;i<=amount;i++){
  scanf("%d %c",&num, &type);  
  if(type == 'S'){
    aFrog+= num;
  }else if(type == 'C'){
    aBunny+= num;
  }else if(type == 'R'){
    aMouse+= num;
  }
  all+=num;
  }
  pBunny = (aBunny*100)/(all*1.00);
  pMouse = (aMouse*100)/(all*1.00);
  pFrog = (aFrog*100)/(all*1.00);
  printf("Total: %d cobaias\n",all);
  printf("Total de coelhos: %d\n",aBunny);
  printf("Total de ratos: %d\n",aMouse);
  printf("Total de sapos: %d\n",aFrog);
  printf("Percentual de coelhos: %.2f %\n",pBunny);
  printf("Percentual de ratos: %.2f %\n",pMouse);
  printf("Percentual de sapos: %.2f %\n",pFrog);
  return 0;
}